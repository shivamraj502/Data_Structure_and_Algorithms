/**Day 124 – House Robber
Concept: Non-adjacent sum selection pattern.
Problem: House Robber – LeetCode 198
Goal: Handle “include/exclude” pattern. */

public class LC198 {
    public static int robber(int []nums){
        int max =0;
        for(int i=0;i<nums.length;i++){
            int temp = 0;
            for(int j=i;j<nums.length;j+=2){
                temp+=nums[j];
            }if(temp>max)max=temp;
        }return max;
    }
    
    public static int robber2(int []nums){
        int p1 = nums[0];
        int p2 = nums[1];
        int curr=Math.max(p1, p2);
        // System.out.println("curr: "+curr);

        for(int i=2;i<nums.length;i++){
            curr = Math.max(curr, p1+nums[i]);
            // System.out.println("curr: "+curr);
            p1 = p2;
            p2=curr;
        }return curr;
        
    }
    
    public static int robber3(int []nums){
        if(nums.length==1)return nums[0];

        int p1 = nums[0];
        int p2 = nums[1];
        int curr=Math.max(p1, p2);

        for(int i=2;i<nums.length;i++){
            curr = Math.max(curr, p1+nums[i]);
            
            p1 = Math.max(p1, p2);
            p2=curr;
        }return curr;
        
    }
    public static void main(String[] args) {
        // int [] nums = {1,2,3,1};     //4
        // int [] nums = {2,7,9,3,1};      //12
        int [] nums = {2,1,1,2};      //4
        System.out.println(robber(nums));
        System.out.println(robber2(nums));
        System.out.println(robber3(nums));
    }
}
/**Example 1:
Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.

Example 2:
Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.
 
Example 3:
Input: nums = [2,1,1,2]
Output: 4
 */