/**
Day 106 – Heap Insertion & Deletion
Concept: Heapify up/down operations.
Problem: Build Min Heap – GFG
Goal: Understand restructuring logic.
 */

import java.util.*;
public class MinHeapp{

    static ArrayList<Integer> heap = new ArrayList<>();

    public static void insert(int value) {

        // Add element at the end
        heap.add(value);

        int i = heap.size() - 1;

        // Heapify Up
        while(i > 0) {

            int parent = (i - 1) / 2;

            if(heap.get(i) >= heap.get(parent)) {
                break;
            }

            // Swap
            int temp = heap.get(i);
            heap.set(i, heap.get(parent));
            heap.set(parent, temp);

            i = parent;
        }
    }

    public static int delete() {
    if(heap.size() == 0) {
        return -1;
    }

    int removed = heap.get(0);

    // Move last element to root
    heap.set(0, heap.get(heap.size() - 1));

    // Remove last element
    heap.remove(heap.size() - 1);

    int i = 0;

    // Heapify Down
    while(true) {

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        int smallest = i;

        if(left < heap.size() &&
           heap.get(left) < heap.get(smallest)) {
            smallest = left;
        }

        if(right < heap.size() &&
           heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }

        if(smallest == i) {
            break;
        }

        // Swap
        int temp = heap.get(i);
        heap.set(i, heap.get(smallest));
        heap.set(smallest, temp);

        i = smallest;
    }

    return removed;
    }

    public static void buildMinHeap(int[] arr) {

    int n = arr.length;

    for(int i = n / 2 - 1; i >= 0; i--) {
        heapifyDown(arr, n, i);
    }
}
    public static void heapifyDown(int[] arr, int n, int i) {

    int smallest = i;

    int left = 2 * i + 1;
    int right = 2 * i + 2;

    if(left < n && arr[left] < arr[smallest]) {
        smallest = left;
    }

    if(right < n && arr[right] < arr[smallest]) {
        smallest = right;
    }

    if(smallest != i) {

        int temp = arr[i];
        arr[i] = arr[smallest];
        arr[smallest] = temp;

        heapifyDown(arr, n, smallest);
    }
    }
    public static void main(String[] args) {

        insert(10);
        insert(20);
        insert(15);
        insert(30);
        insert(40);
        insert(5);
        System.out.println(heap);


        int[] arr = {10, 5, 15, 2, 20};
        buildMinHeap(arr);
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}

/**
 * Insertion:
Add at end
    ↓
Compare with parent(Heapify UP ⬆️)
    ↓
If smaller → swap
    ↓
Continue upward

 * Deletion
Remove root
    ↓
Move last element to root
    ↓
Compare with children(Heapify DOWN ⬇️)
    ↓
Swap with smaller child
    ↓
Continue downward

parent: (i - 1) / 2
childrens: left  = 2 * i + 1    ,right = 2 * i + 2

Min Heap :
Parent <= Children

Max Heap :
Parent >= Children

INSERTION  → Heapify UP
DELETION   → Heapify DOWN
 */