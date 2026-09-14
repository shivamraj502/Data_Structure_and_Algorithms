/**
Day 109 – Merge K Sorted Lists
Problem: Merge k Sorted Lists – LeetCode 23
Goal: Practice multi-heap problem.
 */

import java.util.*;
public class LC23{
    public static ListNode mergeKLists(ListNode[] lists) {
        
    }
    public static void main(String[] args) {
        
        System.out.println(mergeKSortedLists(lists));

    }
}
/**
Example 1:
Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted linked list:
1->1->2->3->4->4->5->6

Example 2:
Input: lists = []
Output: []

Example 3:
Input: lists = [[]]
Output: []
 */

/**
K sorted lists
      ↓
Put first node of each list in Min Heap
      ↓
Take smallest
      ↓
Add to answer
      ↓
Add that node's next node
      ↓
Repeat

Complexity :
If there are N total nodes and k lists:
Time: O(N log k)
Space: O(k)
 */