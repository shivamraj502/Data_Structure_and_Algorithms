public class Leetcode238 {
    public static int[] product(int [] arr){

        if(arr.length<=2) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
            
            return arr;}

        if(arr.length<=2) return arr;
        int [] newArr = new int[arr.length];

        int p = 1,count =0;
        for(int j=0;j<arr.length;j++){  //-1,1,0,-3,3
                if(arr[j]==0) {count++ ;continue;}
                p *= arr[j];
        }

        for(int j=0;j<arr.length;j++){
            if(count == 1){ 
                if(arr[j]==0){ newArr[j] = p;}
                else{ newArr[j]=0;  }
            }else if(count>1){
                newArr[j]=0;
            }
            else{ newArr[j] = p/arr[j]; }
        }return newArr;

        // for(int i=0;i<arr.length;i++){
        //     int p = 1;
        //     for(int j=0;j<arr.length;j++){
        //         if(j==i) continue;
        //         p *= arr[j];
        //     }newArr[i]=p;
        // }return newArr;

        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         if(j==i) continue;
        //         p *= arr[j];
        //     }newArr[i]=p;
        // }return newArr;
    }

    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {-1,0,0,-3,3};
        int [] res = product(arr1);

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}

// leetcode 238: without using two arrays(suffix and prefix)