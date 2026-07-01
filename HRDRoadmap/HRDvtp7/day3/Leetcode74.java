public class Leetcode74 {
    public static boolean isFound(int [][] arr, int t){
        for(int i= 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){       // mistake: forgot to write i as arr[i]
                if(arr[i][j]== t) return true;
            }
        }return false;
    }

    public static boolean isFound2(int [][] arr, int t){
        int i= 0;
        int j= arr[0].length-1;
        
        while(i<arr.length && j>=0){
            if(arr[i][j] == t){return true;}
            else if(arr[i][j] > t){ j--;}
            else i++;        
        }return false;
    }
    public static void main(String[] args) {
        int [][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(isFound2(arr, 9));
    }
}
