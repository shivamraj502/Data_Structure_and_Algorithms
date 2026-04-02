// Dice Problem

// package HRDRoadmap.BasicProblems;
public class DiceProblem {
    public static int findOpposite(int choice){
        switch (choice) {
            case 1:
                return 6;
                
            case 2:
                return 5;
                
            case 3:
                return 4;
                
            case 4:
                return 3;
                
            case 5:
                return 2;
                
            case 6:
                return 1;
                
            default:
                break;
        }
        return 0;
    }
    public static void main(String[] args) {
        int choice = 2;
        int res =findOpposite(choice);
        System.out.println("res: "+res);
    }
}
