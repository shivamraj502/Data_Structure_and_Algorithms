/**
Day 38 – Stack Basics
Concept: LIFO structure, operations (push, pop, peek), using array.
Problem: Implement Stack using Array – GFG
Goal: Understand stack fundamentals.
 */

public class ImplementStackusingArray {
    public static int top;
    public static int Push(int top,int arr[],int n){
        ++top;
        arr[top] = n;
        System.out.println("inserted: "+ arr[top]);
        return top;
    }

    public static int Pop(int top,int arr[]){
        int res = arr[top];
        top--;
        System.out.println("popped: "+ res);
        return top;
    }

    public static int Peek(int top,int arr[]){
        int res= (arr[top]);
        return res;
    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        top = -1;
        top = Push(top,arr,44);
        top = Push(top,arr,46);
        top = Push(top,arr,48);

        top = Pop(top,arr);
        // top = Pop(top,arr);

        int result = Peek(top,arr);
        System.out.println("Peek: "+ result);

        System.out.print("Remaining: ");
        for(int i=top;i>=0;i--){
        System.out.print(arr[i]+" ");
        System.out.print(".");
        }
    }
}
