public class towerOfHanoii {

    // This function solves Tower of Hanoi problem
    // n = number of disks
    // source = starting rod
    // helper = middle rod (temporary)
    // destination = target rod where we want to move all disks
    public static void towerOfHanoi(int n, char source, char helper, char destination) {
        
        // Base Case: If only 1 disk is there, just move it directly
        if (n == 1) {
            System.out.println("Move disk S from " + source + " to " + destination);
            System.out.println(".");
            return;  // Stop here, no more work needed
        }

        // Step 1: Move (n-1) disks from source to helper
        // We use destination as temporary helper for this step
        System.out.println("..");
        towerOfHanoi(n - 1, source, destination, helper);
        System.out.println("...");

        // Step 2: Move the current disk from source to destination
        // We map disk number to S, M, L
        String diskName = "";
        if (n == 1) diskName = "S";
        else if (n == 2) diskName = "M";
        else if (n == 3) diskName = "L";
        else diskName = "Disk " + n;   // for n > 3

        System.out.println("Move disk " + diskName + " from " + source + " to " + destination);
        System.out.println("....");

        // Step 3: Move the (n-1) disks from helper to destination
        // Now we use source as temporary helper
        towerOfHanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 3;                    // Change this number to test (try 2, 3, or 4)
        
        System.out.println("Tower of Hanoi with " + n + " disks:\n");
        
        // Calling the function
        // A = Source, B = Helper, C = Destination
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}




// public class TowerofHanoi {
//     public static void hanoiTower(int n,char s,char a,char d){
//         if(n==1){
//             // System.out.println("Move disk 1 from " + s + " to " + d);
//             System.out.println(".");
//             return;
//         }

//         hanoiTower(n-1, s, d, a);
//         // System.out.println("Move disk " + n + " from " + s + " to " + d);
//         System.out.println("..");
//         hanoiTower(n-1, a, s, d);
//     }
//     public static void main(String[] args) {
//         int n=3;
//         char source='A';
//         char aux='B';
//         char des='C';
//         hanoiTower(n,source,aux,des);
//     }
// }
