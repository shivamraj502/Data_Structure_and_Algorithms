public class CheckStringRotation {
    public static boolean isRot(String s , String s2){
        
        // String temp = s; 
        // System.out.println(s.contains(s2));  // not working
        // for(int i=0;i<s.length();i++){
        //     temp += s.charAt(i);
        // }

        // String temp = s+s;           // working
        // return temp.contains(s2);

        return (s+s).contains(s2);      // working
    }
    public static void main(String[] args) {
        String s = "shivam";
        String s2 = "hivams";
        System.out.println(isRot(s,s2));
    }
}
