import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
// import java.util.*;

public class PriorityQueue1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(1);
        pq.add(222);
        pq.add(3);
        pq.add(4);

        System.out.println(pq);
        System.out.println(pq.poll());
        
        System.out.println(pq);
        System.out.println(pq.poll());
       
        System.out.println(pq);
        System.out.println(pq.poll());
    }
}