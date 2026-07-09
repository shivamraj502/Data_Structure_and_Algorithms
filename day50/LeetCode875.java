/**
 * Day 50 – Binary Search on Answer (Advanced Concept)
 * Concept: Use binary search to solve optimization problems.
 * Problem: Koko Eating Bananas – LeetCode875
 * Goal: Master problem-solving using binary search beyond arrays.
 */
public class LeetCode875 {
    public static int minEatingSpeed(int[] piles, int h) {

        int min=piles[0];
        int max=piles[0];
        for(int i=0;i<piles.length;i++){
            if(piles[i]<min){min=piles[i];}
            if(piles[i]>max){max=piles[i];}
        }System.out.println("min: "+min+" ,max: "+max);

        for(int i=1;i<=max;i++){ 
            int sum=0;
            for(int j=0;j<piles.length;j++){  // { 30,11,23,4,20 } div: 2 {15, 5.5, 11.5, 2, 10 }
            if(piles[j]%i==0){
                // System.out.println("new: "+ (piles[j]/i)); 
                sum=sum+(piles[j]/i);
                // System.out.println("new sum: "+sum);
            }else{
                // System.out.println("else new: "+ ((piles[j]/i)+1));
                sum=sum+((piles[j]/i)+1);
                // System.out.println("else sum: "+sum);
            }
        }
            // System.out.println("sum: "+sum);
            if(sum==h){return i;}
        }return -1;   
    }
    public static int minEatingSpeed2(long[] piles, long h) {

        long min=piles[0];
        long max=piles[0];
        for(int i=0;i<piles.length;i++){
            if(piles[i]<min){min=piles[i];}
            if(piles[i]>max){max=piles[i];}
        }//System.out.println("min: "+min+" ,max: "+max);

        if(h>max && piles.length==1){ return 1;}
        for(int i=1;i<=max;i++){ 
            long sum=0;
            for(int j=0;j<piles.length;j++){  // { 30,11,23,4,20 } div: 2 {15, 5.5, 11.5, 2, 10 }
                sum += Math.ceilDiv(piles[j], i);
            // System.out.println("sum: "+sum);
            }
            if(sum<=h){return i;}
        }return -1;   
    }
    public static int minEatingSpeed3(long[] piles, long h) {

    long max = piles[0];

    for(int i = 0; i < piles.length; i++){
        if(piles[i] > max){
            max = piles[i];
        }
    }

    long low = 1;
    long high = max;
    long ans = max;

    while(low <= high){

        long mid = low + (high - low) / 2;

        long sum = 0;

        for(int i = 0; i < piles.length; i++){
            sum += Math.ceilDiv(piles[i], mid);
        }

        if(sum <= h){
            ans = mid;
            high = mid - 1;
        }
        else{
            low = mid + 1;
        }
    }

    return (int)ans;
    }

    public static void main(String[] args) {
        // int[] piles = { 30,11,23,4,20 }; //speed = 50 banana / hour    { 30,11,23,4,20 }
        // int h = 5;
        // int h = 6;
        long[] piles = { 3,6,7,11 };  
        long h = 8;                                            
        // long[] piles = {312884470 };    
        // long h = 312884469;                                           
        System.out.println("speed: "+minEatingSpeed3(piles, h));
        // System.out.println(Math.ceilDiv(312884470,312884469));
    }
}

/** minEatingSpeed
 * Example 1:
 * Input: piles = [3,6,7,11], h = 8
 * Output: 4
 * Example 2:
 * Input: piles = [30,11,23,4,20], h = 5
 * Output: 30
 * Example 3:
 * Input: piles = [30,11,23,4,20], h = 6
 * Output: 23
 * Math.ceil(15,2)
 * Example 4:
 * Input: piles = [312884470], h = 312884469
 * Output: 23
 * Math.ceil(15,2)
 */

/**
 * if(h>piles[j]) {sum +=1;}
 * 
 */