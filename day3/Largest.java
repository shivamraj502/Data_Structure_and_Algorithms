// Find the Largest of Three Numbers

import java.util.Scanner;

public class Largest {
    public static int find(int a, int b, int c){
        if(a>b && a>c) return a;
        else if(b>c) return b;
        else return c;
    }

    public static void main2(String[] args) {
        Scanner in =new Scanner(System.in);
        int a,b,c;
        // int largest = a;

        System.out.println("enter a: ");
        a = in.nextInt();
        System.out.println("enter b: ");
        b = in.nextInt();
        System.out.println("enter c: ");
        c = in.nextInt();
        
        System.out.println("largest is:");
        if(a>b && a>c){
            System.out.println(a);
        }else if( b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        int a=4;
        int b=34;
        int c=2;
        System.out.println(find(a,b,c));
    }
}
