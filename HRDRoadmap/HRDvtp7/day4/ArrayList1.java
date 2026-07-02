import java.util.ArrayList;
import java.util.Collections;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(8);
        list.add(248);
        list.add(83);
        list.add(82);

        System.out.println(list);

        Collections.sort(list);
    }
}


