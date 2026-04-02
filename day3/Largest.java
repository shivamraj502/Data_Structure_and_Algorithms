// Find the Largest of Three Numbers

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
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
}
