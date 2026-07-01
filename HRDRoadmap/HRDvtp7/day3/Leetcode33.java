public class Leetcode33 {
    public static int search(int [] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){ return i;}
        }return -1;
    }
    public static void main(String[] args) {
        int [] arr = {4,5,0,1,2,3};
        int target = 0;
        System.out.println(search(arr, target));
        
    }
}
