public class TowerofHanoi {
    public static void hanoiTower(int n,char s,char a,char d){
        if(n==1){
            // System.out.println("Move disk 1 from " + s + " to " + d);
            System.out.println(".");
            return;
        }

        hanoiTower(n-1, s, d, a);
        // System.out.println("Move disk " + n + " from " + s + " to " + d);
        System.out.println("..");
        hanoiTower(n-1, a, s, d);
    }
    public static void main(String[] args) {
        int n=3;
        char source='A';
        char aux='B';
        char des='C';
        hanoiTower(n,source,aux,des);
    }
}
