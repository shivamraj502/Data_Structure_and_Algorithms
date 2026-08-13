import java.util.*;
class R1{
    public static int [] remDup(int [] arr){
        int [] temp = new int[arr.length];
        int count = 0;
        temp[0] = arr[0];

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(temp[count] != arr[j]){
                    count += 1;
                    temp[count] = arr[j];
                    // System.out.println(count);
                    i += count;
                    break;
                }
            }
        }

        // for(int i=0;i<arr.length;i++){
        //         System.out.print(temp[i]+" ");
        // }

        return temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4};
        int [] res = remDup(arr);
        System.out.println(Arrays.toString(res));
    }
}