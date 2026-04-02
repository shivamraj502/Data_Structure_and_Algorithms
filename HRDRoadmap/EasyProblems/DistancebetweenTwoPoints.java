 // Distance between Two Points 
 // https://www.geeksforgeeks.org/dsa/program-calculate-distance-two-points/

// package HRDRoadmap.EasyProblems;
public class DistancebetweenTwoPoints {
    public static float distance(int x1,int y1,int x2,int y2){
        return (float)Math.sqrt(((x2-x1)*(x2-x1) +(y2-y1)*(y2-y1)));
    }
    public static void main(String[] args) {
        int x1=1, y1=10 ,x2=5, y2=5;
        float res= distance(x1,y1,x2,y2);
        System.out.printf("Distance: %.2f \n",res);
        System.out.printf("%-10s %5d", "Shivam", 25);
    }
}