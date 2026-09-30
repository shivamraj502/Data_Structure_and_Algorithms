/**Day 143 – Fractional Knapsack
Concept: Greedy variant of Knapsack.
Problem: Fractional Knapsack – GFG
Goal: Learn sorting-based greedy optimization. */

import java.util.*;
public class FractionalKnapsack {
    public static double fractionalKnapsack(int[] weight, int[] value, int capacity) {

    int n = weight.length;
    double[][] items = new double[n][3];

    for(int i = 0; i < n; i++) {

        items[i][0] = weight[i];
        items[i][1] = value[i];
        items[i][2] = (double)value[i] / weight[i];
    }

    // Sort by value/weight in descending order
    Arrays.sort(items, (a, b) -> Double.compare(b[2], a[2]));

    double totalValue = 0;

    for(int i = 0; i < n; i++) {

        if(capacity >= items[i][0]) {

            // Take complete item
            capacity -= (int)items[i][0];
            totalValue += items[i][1];

        } else {

            // Take fraction of item
            totalValue += items[i][1] * ((double)capacity / items[i][0]);

            capacity = 0;
            break;
        }
    }

    return totalValue;
    }
    
    public static class Item {
    int weight;
    int value;
    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
        }
    }
    public static double fractionalKnapsack2(int[] weight, int[] value, int capacity) {

        int n = weight.length;
        Item[] items = new Item[n];

        for(int i = 0; i < n; i++) {
            items[i] = new Item(weight[i], value[i]);
        }

        Arrays.sort(items, (a, b) -> {

            double ratio1 =(double)a.value / a.weight;

            double ratio2 =(double)b.value / b.weight;

            return Double.compare(ratio2, ratio1);
        });

        double totalValue = 0;

        for(Item item : items) {

            if(capacity >= item.weight) {
                capacity -= item.weight;
                totalValue += item.value;

            } else {
                totalValue +=item.value *((double)capacity / item.weight);
                break;
            }
        }

        return totalValue;
    }

    public static double fractionalKnapsack3(int[] weight, int[] value, int capacity) {

        ArrayList<Integer> index = new ArrayList<>();

        for(int i = 0; i < weight.length; i++) {index.add(i);}

        Collections.sort(index, (a, b) -> {

            double ratio1 =(double)value[a] / weight[a];

            double ratio2 =(double)value[b] / weight[b];

            return Double.compare(ratio2, ratio1);
        });

        double totalValue = 0;

        for(int i : index) {

            if(capacity >= weight[i]) {
                capacity -= weight[i];
                totalValue += value[i];
            } else {
                totalValue +=value[i] *((double)capacity / weight[i]);
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        int[] weight = {10, 20, 30}; int[] value = {60, 100, 120}; int capacity = 50;

        System.out.println(fractionalKnapsack(weight, value, capacity));
        System.out.println(fractionalKnapsack2(weight, value, capacity));
        System.out.println(fractionalKnapsack3(weight, value, capacity));
    }
}

/*
Test Case 1: weight = [10, 20, 30], value = [60, 100, 120], capacity = 50 → Output: 240.0
Test Case 2: weight = [10, 20, 30], value = [60, 100, 120], capacity = 20 → Output: 100.0
Test Case 3: weight = [5, 10, 15], value = [30, 40, 45], capacity = 20 → Output: 85.0
Test Case 4: weight = [2, 3, 5, 7], value = [20, 30, 45, 70], capacity = 10 → Output: 105.0
Test Case 5: weight = [12, 25, 18, 30, 10], value = [48, 100, 72, 90, 50], capacity = 40 → Output: 170.0
*/

/**Day 143 – Fractional Knapsack

Concept:
Greedy

Goal:
Maximum value within capacity.

Greedy criterion:
value / weight

Steps:
1. Calculate value/weight.
2. Sort descending by ratio.
3. Take complete item if it fits.
4. Otherwise take required fraction.
5. Stop when capacity becomes 0.

Important:
Fraction of item is allowed.

0/1 Knapsack:
Cannot split → DP

Fractional Knapsack:
Can split → Greedy

Complexity:
O(n log n) time
O(n) space */