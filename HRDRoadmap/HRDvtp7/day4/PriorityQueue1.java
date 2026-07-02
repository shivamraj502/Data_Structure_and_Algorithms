import java.util.PriorityQueue;
public class PriorityQueue1 {
    public static void main(String[] args) {
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