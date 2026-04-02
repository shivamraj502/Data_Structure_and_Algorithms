public class isPal {
    public static boolean isTrue(String s){
        // boolean isbool=true;
        s=s.toLowerCase();
        String s2 = s.replaceAll("[^a-z0-9]","");
        System.out.println();
        System.out.println(s2);

        for(int i=0;i<=s2.length()/2;i++){
            if(s2.charAt(i)!=s2.charAt(s2.length()-i-1)){return false;}
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isTrue(s));
    }
 
}
