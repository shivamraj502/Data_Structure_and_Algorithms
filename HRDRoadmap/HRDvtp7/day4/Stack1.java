// package HRDRoadmap.HRDvtp7.day4;
public class Stack1 {
   static int [] arr;
   static int top=0;
   
   public static int push(int [] arr, int n, int top){
        System.out.println(n+" added");
        arr[top++]=n;
        return top;
   }
   public static int pop(int [] arr, int top){
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
    public static boolean isEmpty(){
        return (top == -1);
    }
    public static void main(String[] args) {
        int [] nums = new int[10];

        //Add
        top = push(nums, 5, top);
        top = push(nums, 52, top);
        top = push(nums, 25, top);
        System.out.print("stack: ");
        for(int i=0;i<top;i++){System.out.print(nums[i]+" ");}
        System.out.println();

        //Remove
        top = pop(nums, top);
        System.out.print("stack: ");
        for(int i=0;i<top;i++){System.out.print(nums[i]+" ");}
        System.out.println();

        //Peek
        System.out.println("Peek: "+peek(nums));

        //size
        System.out.println("Size: "+size());
        
        //is Empty
        System.out.println("is empty? "+isEmpty());
        System.out.println();
    }
}
