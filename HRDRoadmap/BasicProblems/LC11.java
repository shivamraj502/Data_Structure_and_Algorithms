// package HRDRoadmap.HRDvtp7.day8;
public class LC11 {
    public static int maxArea(int [] height){
        // int max = height[0];
        int max = -1;
        for(int i=0;i<height.length;i++){
            int temp=0;
            for(int j=i+1;j<height.length;j++){
                temp += (Math.min(height[i],height[j]))*(j-i);
                if(temp>max) max=temp;
                // System.out.println("temp: "+temp+" ,max: "+max+" ,min: "+(Math.min(height[i],height[j])));
                temp = 0;
            }
        }return max;
    }
    public static int maxArea2(int [] height){
        int max = -1;
        int left=0,right=height.length-1;

        while(left < right){
                int temp=0;
                temp += (Math.min(height[left],height[right]))*((right)-(left));
                if(temp>max) max=temp;
                // System.out.println("((right)-(left)):"+((right)-(left))+" temp: "+temp+" ,max: "+max+" ,min: "+(Math.min(height[left],height[right])));
                temp = 0;

                if(height[left]<height[right]) left++;
                else    right--;    //right++;
                
                // System.out.println("left: "+left+" ,right: "+right);
                // System.out.println();
        }return max;
    }
    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        // int [] height = {1,1};
        // int [] height = {1,2};
        // int [] height = {2,1};
        System.out.println(maxArea2(height));
    }
}

/**
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 */

/**
 * i written: right++ and left-- but it should be right-- and left++
 */