// package HRDRoadmap.HRDvtp7.day4;
public class Queue1 {
   static int [] arr;
   static int Size=0;
   
   public static int add(int [] arr, int n, int Size){
        System.out.println(n+" added");
        arr[Size++]=n;
        return Size;
   }
   public static int remove(int [] arr, int Size){
        System.out.println(arr[0]+" removed");
        Size--;
        return Size;
   }
   public static int peek(int [] arr){
        return arr[0];
   }
   public static int size(){
        return Size;
   }
    public static void main(String[] args) {
        int [] nums = new int[10];

        //Add
        Size = add(nums, 5, Size);
        Size = add(nums, 52, Size);
        Size = add(nums, 25, Size);
        System.out.print("stack: ");
        for(int i=0;i<Size;i++){System.out.print(nums[i]+" ");}
        System.out.println(Size);

        //Remove
        Size = remove(nums, Size);
        System.out.print("stack: ");
        for(int i=0;i<Size;i++){System.out.print(nums[i]+" ");}
        System.out.println();

        //Peek
        System.out.println("Peek: "+peek(nums));

        //size
        System.out.println("Size: "+size());
        System.out.println();
    }
}
