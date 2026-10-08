/**Day 149 – Mini Project #20
- Task: Build a File Compression Estimator (Huffman + Bit ops)
- Goal: Combine Greedy + Bit manipulation in practice.*/

import java.util.*;
public class MiniProject20 {
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

    public static Map<Character, Integer> frequency(String text) {

        Map<Character, Integer> freq = new HashMap<>();

        for(char ch : text.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        return freq;
    }

    public static Node buildTree(Map<Character, Integer> freq) {

        PriorityQueue<Node> pq =
            new PriorityQueue<>((a, b) -> a.freq - b.freq);

        for(Map.Entry<Character, Integer> entry : freq.entrySet()) {
            pq.add(new Node(entry.getKey(), entry.getValue()));
        }

        while(pq.size() > 1) {

            Node first = pq.poll();
            Node second = pq.poll();

            Node newNode = new Node(
                first.freq + second.freq,
                first,
                second
            );

            pq.add(newNode);
        }

        return pq.poll();
    }

    public static void generateCodes(
            Node root,
            String code,
            Map<Character, String> codes) {

        if(root.left == null && root.right == null) {
            codes.put(root.ch, code);
            return;
        }

        generateCodes(root.left, code + "0", codes);
        generateCodes(root.right, code + "1", codes);
    }

    public static int compressedBits(String text,Map<Character, String> codes) {
        int bits = 0;
        for(char ch : text.toCharArray()) {
            bits += codes.get(ch).length();
        }

        return bits;
    }

    public static void main(String[] args) {

        String text = "aaabbc";

        Map<Character, Integer> freq = frequency(text);

        Node root = buildTree(freq);

        Map<Character, String> codes = new HashMap<>();

        generateCodes(root, "", codes);

        int compressedBits = compressedBits(text, codes);

        int originalBits = text.length() * 8;

        int compressedBytes = (compressedBits + 7) / 8;

        int savedBits = originalBits - compressedBits;

        double compressionPercentage =
            ((double) savedBits / originalBits) * 100;

        System.out.println("========== FILE COMPRESSION ESTIMATOR ==========");

        System.out.println("Original Text: " + text);

        System.out.println("\nCharacter Frequencies:");

        for(Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(
                entry.getKey() + " : " + entry.getValue()
            );
        }

        System.out.println("\nHuffman Codes:");

        for(Map.Entry<Character, String> entry : codes.entrySet()) {
            System.out.println(
                entry.getKey() + " : " + entry.getValue()
            );
        }

        System.out.println("\nOriginal Size  : " + originalBits + " bits");
        System.out.println("Compressed Size: " + compressedBits + " bits");
        System.out.println("Compressed Bytes: " + compressedBytes);
        System.out.println("Saved Bits     : " + savedBits);
        System.out.printf(
            "Compression    : %.2f%%\n",
            compressionPercentage
        );

        System.out.println("===============================================");
    }
}