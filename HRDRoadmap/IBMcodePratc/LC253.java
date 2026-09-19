/**      253. Meeting Rooms II    */

import java.util.*;
public class LC253 {
    public static int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        int n = intervals.length;
        int[] startTimes = new int[n];
        int[] endTimes = new int[n];

        for (int i = 0; i < n; i++) {
            startTimes[i] = intervals[i][0];
            endTimes[i] = intervals[i][1];
        }

        Arrays.sort(startTimes);
        Arrays.sort(endTimes);

        int startPointer = 0, endPointer = 0;
        int roomsNeeded = 0;

        while (startPointer < n) {
            if (startTimes[startPointer] < endTimes[endPointer]) {
                roomsNeeded++;
            } else {
                endPointer++;
            }
            startPointer++;
        }return roomsNeeded;
    }
    public static void main(String[] args) {
        int[][] intervals1 = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(minMeetingRooms(intervals1)); // Output: 2

        int[][] intervals2 = {{7, 10}, {2, 4}};
        System.out.println(minMeetingRooms(intervals2)); // Output: 1
    }
}
