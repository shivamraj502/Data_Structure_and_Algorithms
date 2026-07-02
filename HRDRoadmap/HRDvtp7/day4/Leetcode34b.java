public class Leetcode34b {       // can be solve it using binary search and function(leftSearch and rightSearch) also
    public static int[] search(int [] nums,int target){
        int left = 0;
        int right = nums.length-1;
        int [] result = {-1,-1} ;
        while(left <= right){
            int mid = left + (right - left)/2;
            System.out.println(mid);
            if(nums[mid]==target){
                while(mid >= 0 && nums[mid]==target){
                    result[0] = mid;
                    result[1] = mid;
                    mid--;
                }
                while(mid < nums.length && nums[mid]==target){
                    result[1] = mid;
                    mid++;
                }
            }
        }return result;
    }
    public static void main(String[] args) {
        int [] arr = {0,1,3,3,3,4,6};
        int target = 3;
        int [] res =search(arr, target);

        System.out.println(res[0]+" "+res[1]);
    }
}
