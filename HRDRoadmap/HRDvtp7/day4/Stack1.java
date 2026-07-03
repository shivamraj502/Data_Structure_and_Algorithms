// package HRDRoadmap.HRDvtp7.day4;
public class Stack1 {
   static int [] arr;
   static int top=0;
   
   public static int add(int [] arr, int n, int top){
        System.out.println(n+" added");
        arr[top++]=n;
        return top;
   }
   public static int remove(int [] arr, int top){
        System.out.println(arr[top-1]+" removed");
        top--;
        return top;
   }
   public static int peek(int [] arr){
        return arr[top-1];
   }
   public static int size(){
        return top;
   }
    public static void main(String[] args) {
        int [] nums = new int[10];

        //Add
        top = add(nums, 5, top);
        top = add(nums, 52, top);
        top = add(nums, 25, top);
        System.out.print("stack: ");
        for(int i=0;i<top;i++){System.out.print(nums[i]+" ");}

        //Remove
        top = remove(nums, top);
        System.out.print("stack: ");
        for(int i=0;i<top;i++){System.out.print(nums[i]+" ");}
        System.out.println();

        //Peek
        System.out.println("Peek: "+peek(nums));

        //size
        System.out.println("Size: "+size());
        System.out.println();
    }
}
