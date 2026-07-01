public class LinearSearch {
    public static int ls(int [] arr,int t){
        for(int i= 0;i<arr.length;i++){
            if(arr[i]==t) return i;
        }return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int t = 8;
        System.out.println(ls(arr, t));
    }
}
