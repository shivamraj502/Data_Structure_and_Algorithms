// Day 21 — Mini-Project #3
// Task: Implement an Array Operations Menu – insert, delete, search, and display using methods.
// Goal: Reinforce Week 3 skills.

import java.util.Scanner;
public class ReinforceWeek3skills {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int [] arr = new int[5];

        while(true){
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. search");
            System.out.println("4. display");
            System.out.println("5. exit");

            System.out.println("enter choice: ");
            int ch = in.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("enter value to insert: ");
                    int v = in.nextInt();
                    insert2(arr, v);
                    break;
                case 2:
                    System.out.println("enter value to delete: ");
                    int v2 = in.nextInt();
                    delete2(arr, v2);
                    break;
                case 3:
                    System.out.println("enter value to search: ");
                    int v3 = in.nextInt();
                    System.out.println(search2(arr,v3));
                    break;
                case 4:
                    display2(arr);
                    break;
                case 5:
                    exit2();
                    return;        
                default:
                    break;
            }
        }
    }
    public static void insert2(int [] arr , int v){
        for(int i=0;i<arr.length-1;i++){ 
            arr[arr.length-1-i] = arr[arr.length-2-i];  // 4>3,3>2,2>1,1>0 i>0 1 2 3
        }arr[0]=v;
    }
    public static void delete2(int [] arr , int v){
        for(int i=0;i<arr.length;i++){ 
            if(arr[i] == v){
                for(int j = i;j<arr.length-1;j++){
                    arr[j] = arr[j+1];
                }break;
            }
        }
    }
    public static boolean search2(int arr[],int t){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==t){ return true;}
        }return false;
    }
    public static void display2(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void exit2(){
        System.out.println("returning!");
        return;
    }


    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter array length: ");
        int n = in.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        while(true){
            System.out.println("\nMenu");
            System.out.println("1. Insert");
            System.out.println("2. delete");
            System.out.println("3. search");
            System.out.println("4. display");
            System.out.println("5. Exit");
            System.out.println("enter choice(0 - 5):");
            int ch = in.nextInt();
            switch (ch) {
                case 1:System.out.println("enter a data to insert:");
                       int i = in.nextInt();
                       arr = insert(arr,i);
                       break;

                case 2:System.out.println("enter a data to delete:");
                       int d = in.nextInt();
                       arr = delete(arr,d);
                       break;
                
                case 3:System.out.println("enter a data to search: ");
                       int s = in.nextInt();
                       search(arr,s);
                       break;

                case 4:System.out.println("displaying: ");
                       display(arr);
                       break;

                case 5:System.out.println("exiting!");
                       System.exit(0);

                default:
                    System.out.println("enter a valid option");
                    break;
            }
        }
    }

    public static int[] insert(int [] arr, int i){
        int n= arr.length;

        int [] newarr= new int[n+1];
        for(int j= 0;j<n;j++){
            newarr[j] = arr[j];
        }
        newarr[n] = i;
        System.out.println("inserted successfully");
        return newarr;
    }

    public static int[] delete(int[] arr, int d) {
        int n = arr.length;
        int index = -1;

        for (int i = 0; i < n; i++) {
        if (arr[i] == d) {
            index = i;
            break;
        }}

        if (index == -1) {
            System.out.println("Element not found");
        return arr;
        }

        int[] newArr = new int[n - 1];

        for (int i = 0, j = 0; i < n; i++) {
        if (i != index) {
            newArr[j] = arr[i];
            j++;
        } }

        System.out.println("Deleted successfully");
        return newArr;
    }
    
    public static void search(int [] arr, int s){
        int n= arr.length;boolean bool = false;
        for(int i=0;i<n;i++){
            if(arr[i]==s){
                System.out.println("found successfully");
                bool = true;
                break;
            }
        }if(bool == false) System.out.println("not found");
    }

    public static void display(int [] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
}