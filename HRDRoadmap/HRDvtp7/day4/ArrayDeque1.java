// package HRDRoadmap.HRDvtp7.day4;
// import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.ArrayDeque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        // PriorityQueue<Integer> pq = new PriorityQueue<>();       //MIN-HEAP
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());    // MAX-HEAP
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.addFirst(1);
        ad.addFirst(222);
        ad.addLast(3);
        ad.addLast(4);

        System.out.println(ad);
        System.out.println(ad.peekFirst());
        
        System.out.println(ad);
        System.out.println(ad.peekLast());
        
        System.out.println(ad);
        System.out.println(ad.removeFirst());
        System.out.println(ad);
        
    }
}
