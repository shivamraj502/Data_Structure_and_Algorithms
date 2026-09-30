/**⚡ WEEK 21 — Greedy Algorithms & Bit Manipulation
Day 142 – Greedy Algorithm Basics
Concept: Local optimal → global optimal.
Problem: Activity Selection Problem – GFG
Goal: Understand greedy criteria. */

import java.util.*;
public class ActivitySelectionProblem {
    public static int maxActivities(int[] start, int[] finish) {
        int n = start.length;

        // Store activities as {start, finish}
        int[][] activities = new int[n][2];

        for(int i = 0; i < n; i++) {
            activities[i][0] = start[i];
            activities[i][1] = finish[i];
        }

        // Sort by finish time
        Arrays.sort(activities, (a, b) -> a[1] - b[1]);

        int count = 1;
        int lastFinish = activities[0][1];

        for(int i = 1; i < n; i++) {
            if(activities[i][0] >= lastFinish) {
                count++;
                lastFinish = activities[i][1];
            }
        }return count;
    }

    public static void main(String[] args) {
        // int[] start = {1, 3, 0, 5, 8, 5};   int[] finish = {2, 4, 6, 7, 9, 9};
        int[] start = {4, 2, 1, 7, 5, 8, 9, 11, 12};   int[] finish = {5, 3, 2, 10, 6, 9, 11, 12, 14};

        System.out.println(maxActivities(start, finish));
    }
}

/**Test Case 1
Input: start  = [1, 3, 0, 5, 8, 5]
finish = [2, 4, 6, 7, 9, 9]
Output: 4


Test Case 2
Input: start  = [1, 2, 3, 4, 5]
finish = [2, 3, 4, 5, 6]
Output: 5


Test Case 3
Input: start  = [0, 1, 2, 3, 4]
finish = [10, 2, 3, 4, 5]
Output: 4


Test Case 4
Input: start  = [5, 1, 3, 0, 5, 8, 5]
finish = [7, 2, 4, 6, 9, 9, 9]
Output:4

Test Case 5 – Hard 
Input: start  = [4, 2, 1, 7, 5, 8, 9, 11, 12]
finish = [5, 3, 2, 10, 6, 9, 11, 12, 14]
Output:8 */

/**Day 142 – Greedy Algorithm

Problem:
Activity Selection

Goal:
Maximum number of non-overlapping activities.

Greedy criterion:
Choose activity with earliest finish time.

Steps:
1. Sort by finish time.
2. Select first activity.
3. Check remaining activities.
4. If start >= lastFinish → select.
5. Update lastFinish.

Why?
Earlier finish → more remaining time.

Complexity:
O(n log n) time
O(n) space */