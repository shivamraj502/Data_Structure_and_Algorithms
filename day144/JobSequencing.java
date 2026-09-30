import java.util.Arrays;

/**Day 144 – Job Sequencing Problem
Problem: Job Sequencing – GFG
Goal: Learn scheduling-based greedy logic. */
public class JobSequencing {
    static class Job {
        char id;
        int deadline;
        int profit;
        Job(char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void jobScheduling(Job[] jobs) {

        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        boolean[] slot = new boolean[maxDeadline + 1];

        int totalProfit = 0;
        int jobCount = 0;

        for (Job job : jobs) {

            for (int j = job.deadline; j >= 1; j--) {

                if (!slot[j]) {
                    slot[j] = true;
                    totalProfit += job.profit;
                    jobCount++;

                    break;
                }
            }
        }
        System.out.println("Jobs = " + jobCount);
        System.out.println("Profit = " + totalProfit);
    }

    public static void main(String[] args) {
        Job[] jobs = {
            new Job('A', 2, 100),
            new Job('B', 1, 19),
            new Job('C', 2, 27),
            new Job('D', 1, 25),
            new Job('E', 3, 15)
        };

        jobScheduling(jobs);
    }
}

/**
Test Case 1: jobs = [(A,2,100), (B,1,19), (C,2,27), (D,1,25), (E,3,15)] → Output: Jobs = 2, Profit = 127
Test Case 2: jobs = [(A,4,20), (B,1,10), (C,1,40), (D,1,30)] → Output: Jobs = 2, Profit = 60
Test Case 3: jobs = [(A,1,50), (B,2,20), (C,2,30), (D,1,40), (E,3,10)] → Output: Jobs = 3, Profit = 120
Test Case 4: jobs = [(A,2,100), (B,1,50), (C,2,40), (D,3,70), (E,1,60)] → Output: Jobs = 3, Profit = 230
Test Case 5: jobs = [(A,3,35), (B,1,30), (C,2,25), (D,2,20), (E,1,15)] → Output: Jobs = 3, Profit = 90
*/