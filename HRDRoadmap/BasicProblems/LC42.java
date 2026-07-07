public class LC42 {
    public static int trap(int[] height) {
        int count = 0;
        for(int i=0;i<height.length;i++){
            int leftMax = 0;
            int rightMax = 0;
            for(int j=i;j>=0;j--){
                leftMax = Math.max(leftMax,height[j]);
            }
            for(int j=i;j<height.length;j++){
                rightMax = Math.max(rightMax,height[j]);
            }
            count += Math.min(leftMax,rightMax) - height[i];
        }
        return count;
    }
    public static int trap2(int[] height) {
        int count = 0;
        for(int i=0;i<height.length;i++){
            int leftMax = 0;
            int rightMax = 0;
            for(int j=i;j>=0;j--){
                leftMax = Math.max(leftMax,height[j]);
                System.out.println(".");
                System.out.println("leftmax: "+leftMax+" ,height: "+height[j]);
            }
            for(int j=i;j<height.length;j++){
                rightMax = Math.max(rightMax,height[j]);
                System.out.println("..");
                System.out.println("rightmax: "+rightMax+" ,height: "+height[j]);
            }
            count += Math.min(leftMax,rightMax) - height[i];
            System.out.println("math.max: "+ Math.min(leftMax,rightMax) +" ,count: "+count);
        }return count;
    }
    public static int trap3(int[] height) {
        int count = 0;
        // do it using two pointer approach
        
        
        return count;
    }
    public static void main(String[] args) {
        // int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};  //6
        int [] height = {4,2,0,3,2,5};  //9
        System.out.println(trap3(height));
    }
}

/**
Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
 */