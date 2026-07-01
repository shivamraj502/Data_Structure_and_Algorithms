import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList aList = new ArrayList();
        ArrayList newList = new ArrayList();

        aList.add(3);
        aList.add("hii");
        aList.add(true);

        System.out.println(aList);

        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
            aList.add(i);
        }

        newList.add(3);
        newList.add(33);
        newList.add(32);
        for (Object element : newList) {
            System.out.println(element); // Error
            aList.add(77);
        }

        System.out.println(aList);
    }
}
