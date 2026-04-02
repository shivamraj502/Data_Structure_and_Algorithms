// 3. Clock Angle Problem https://www.geeksforgeeks.org/dsa/calculate-angle-hour-hand-minute-hand/

public class ClockAngleProblem {
    public static double calculateAngle(String s){
        double result=-1;
        int hour;
        int min;
        int a=s.charAt(0)-'0';
        int b=s.charAt(1)-'0';
        hour=a*10+b;
        int d=s.charAt(3)-'0';
        int e=s.charAt(4)-'0';
        min=d*10+e;

        // System.out.println("a"+a+" b"+b+" hour"+hour+" d"+d+" e"+e+" min"+min);

        double minDegree = min*6;
        double hourDegree = hour*30+ ((30*minDegree)/360);
        // System.out.println("minDegree: "+minDegree+" ,hourDegree:"+hourDegree);

        result = Math.abs(hourDegree - minDegree);
        result = Math.min(result, 360 - result);

        return result;
    }
    public static void main(String[] args) {
        String s="01:50";
        System.out.println(calculateAngle(s));
    }
}

/**
Input: s = "06:00"
Output: 180.000
Explanation: When the time is 06:00, the angle between the hour and minute hands of the clock is 180.000 degrees.

Input: s = "03:15"
Output: 7.500
Explanation: When the time is 03:15, the angle between the hour and minute hands of the clock is 7.500 degrees.

Input: s = "00:00"
Output: 0.000
Explanation: When the time is 00:00, the angle between the hour and minute hands of the clock is 0.000 degrees.

Input:  "06:30"
Output: 15.0

Input:  "09:45"
Output: -22.5
⚠️ (Your code gives negative because you didn’t take absolute value)

Input:  "01:50"
Output: -245.0
⚠️ (Again negative due to missing Math.abs())
 */