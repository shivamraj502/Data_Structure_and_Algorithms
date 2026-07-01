public class BinarySearch {
    public static int bs(int []arr,int t){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){         // "=" to search last and first element also
            int mid = low + (high-low)/2;
            if(arr[mid]== t){
                return mid;
            }else if(arr[mid]>t){   //Mistake: i written mid > low and low = mid + 1
                high = mid - 1;
            }else low = mid + 1;
        }return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,44};
        int t = 44;
        System.out.println(bs(arr, t));
    }
}


// Q: why O(n) = log(n) base(2) Done: n + n/2 + n/4 + n/8 + ... + n/2^k :> n/2^k = 1 :> k = log_2 (n)