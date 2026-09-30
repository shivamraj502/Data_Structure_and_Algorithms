/**Day 145 – Huffman Encoding
Problem: Huffman Encoding – GFG
Goal: Apply priority queue + greedy approach. */

import java.util.*;
import java.util.PriorityQueue;
public class HuffmanEncoding {
    static class Node {
        char ch;
        int freq;
        Node left;
        Node right;

        Node(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }

        Node(int freq, Node left, Node right) {
            this.freq = freq;
            this.left = left;
            this.right = right;
        }
    }
    public static void generateCodes(Node root, String code, Map<Character, String> codes) {
        // Leaf node
        if (root.left == null && root.right == null) {codes.put(root.ch, code);return;}

        // Left = 0
        generateCodes(root.left, code + "0", codes);

        // Right = 1
        generateCodes(root.right, code + "1", codes);
    }
    public static void huffman(char[] chars, int[] freq) {
        // Min Heap based on frequency
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.freq - b.freq);

        // Add all characters
        for (int i = 0; i < chars.length; i++) {
            pq.add(new Node(chars[i], freq[i]));
        }

        // Build Huffman Tree
        while (pq.size() > 1) {
            Node first = pq.poll();
            Node second = pq.poll();

            Node newNode = new Node(
                first.freq + second.freq,
                first,
                second
            );
            pq.add(newNode);
        }

        // Root of Huffman Tree
        Node root = pq.poll();

        // Generate codes
        Map<Character, String> codes = new HashMap<>();
        generateCodes(root, "", codes);

        // Print codes
        for (char ch : chars) {
            System.out.println(ch + " : " + codes.get(ch));
        }
    }
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] freq = {5, 9, 12, 13, 16, 45};

        huffman(chars, freq);
    }
}

/**
Test Case 1: characters = [a, b, c, d, e, f], frequencies = [5, 9, 12, 13, 16, 45] → Output: [110, 111, 100, 101, 110, 0]
Test Case 2: characters = [a, b, c, d], frequencies = [5, 9, 12, 13] → Output: [00, 01, 10, 11]
Test Case 3: characters = [a, b, c], frequencies = [5, 9, 12] → Output: [10, 11, 0]
Test Case 4: characters = [a, b, c, d, e], frequencies = [10, 20, 30, 40, 50] → Output: [110, 111, 00, 01, 10]
Test Case 5: characters = [a, b, c, d, e, f], frequencies = [10, 15, 12, 3, 4, 13] → Output: [00, 01, 10, 110, 111, 11]
*/ 