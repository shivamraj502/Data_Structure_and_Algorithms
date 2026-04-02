// Day 30 — Mini-Project #4 (Month-End Challenge)
// Task: Build a Student Marks Analyzer in Java:
// Input n students’ names & marks
// Calculate average, highest, lowest, grade distribution
// Use arrays, loops, functions
// Goal: Consolidate all Month-1 skills.

import java.util.Scanner;
public class Day30{
    public static void main(String[] args) {
        int [] arr = {2,5,12,18,20};
        double result1=avg(arr);
        double result2=highest(arr);
        double result3=lowest(arr);
        System.out.println("avg: "+ result1);
        System.out.println("highest: "+ result2);
        System.out.println("lowest: "+ result3);
        grade(arr);
    }

    static double avg(int []arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum/(arr.length);
    }

    static double highest(int []arr){
        int max =arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){ max = arr[i];}
        }
        return max;
    }

    static double lowest(int []arr){
        int min =arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){ min = arr[i];}
        }
        return min;
    }

    static void grade(int []arr){
        System.out.println("Grades are: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=20 && arr[i]>15){System.out.println(arr[i] + " -> A");}
            else if(arr[i]<=15 && arr[i]>10){System.out.println(arr[i] + " -> B");}
            else if(arr[i]<=10 && arr[i]>5){System.out.println(arr[i] + " -> C");}
            else if(arr[i]<=5 && arr[i]>=0){System.out.println(arr[i] + " -> F");}
            else { System.out.println("invalid marks");}
        }
    }
}
