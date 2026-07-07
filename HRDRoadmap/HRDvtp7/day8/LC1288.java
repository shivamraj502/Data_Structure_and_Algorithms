// package HRDRoadmap.HRDvtp7.day8;
public class LC1288 {
    public static int removeCoveredIntervals(int[][] intervals) {
        for(int i=0;i<intervals.length;i++){
            for(int j=0;j<intervals[0].length;j++){
                if(i!=j){
                    // if(((intervals[i][0]>intervals[j][0]) && (intervals[i][1]>intervals[j][1])) || ((intervals[i][0]<intervals[j][0]) && (intervals[i][1]<intervals[j][1]))){
                    //     // System.out.println("1: "+ intervals[i][0]+" "+intervals[j][0] + ",2: "+ intervals[i][1]+" "+intervals[j][1]);
                    //     // System.out.println("i: "+i+" ,j: "+j);
                    //     System.out.println(".");
                    //     return j;
                    // }
                    // else if(((intervals[i][0]>intervals[j][0]) && (intervals[i][1]<intervals[j][1])) || ((intervals[i][0]<intervals[j][0]) && (intervals[i][1]>intervals[j][1]))){
                    //     // System.out.println("1: "+ intervals[i][0]+" "+intervals[j][0] + ",2: "+ intervals[i][1]+" "+intervals[j][1]);
                    //     // System.out.println("i: "+i+" ,j: "+j);
                    //     return i;
                    // }// System.out.println(i +" "+ j);

                    if((intervals[i][0]>=intervals[j][0]) && (intervals[i][1]<=intervals[j][1])){
                        // System.out.println("1: "+ intervals[i][0]+" "+intervals[j][0] + ",2: "+ intervals[i][1]+" "+intervals[j][1]);
                        // System.out.println("i: "+i+" ,j: "+j);
                        return i;
                    }
                    else if((intervals[i][0]<=intervals[j][0]) && (intervals[i][1]>=intervals[j][1])){
                        // System.out.println("1: "+ intervals[i][0]+" "+intervals[j][0] + ",2: "+ intervals[i][1]+" "+intervals[j][1]);
                        // System.out.println("i: "+i+" ,j: "+j);
                        return j;
                    }// System.out.println(i +" "+ j);
                }
            }
        }return -1;
    }
    public static void main(String[] args) {
        int[][] intervals = {{2,8},{3,6}};
        // int[][] intervals = {{1,4},{3,6},{2,8}};
        System.out.println(removeCoveredIntervals(intervals));
    }
}


/**
Example 1:
Input: intervals = [[1,4],[3,6],[2,8]]
Output: 2
Explanation: Interval [3,6] is covered by [2,8], therefore it is removed.
Example 2:
Input: intervals = [[1,4],[2,3]]
Output: 1
 */