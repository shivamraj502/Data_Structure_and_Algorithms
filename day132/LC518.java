/**Day 132 – Coin Change 2 (Count Ways)
Concept: Count combinations to make target.
Problem: Coin Change II – LeetCode 518
Goal: Learn permutation vs combination difference. */

public class LC518 {
    public static int change(int[] coins,int target){
        int [] dp= new int[target+1];
        dp[0]=1;

        for(int coin: coins){
            for(int i=coin;i<=target;i++){
                dp[i]+=dp[i-coin];
            }
        }return dp[target];
    }
    public static void main(String[] args) {
        int [] coins = {1,2,5}; int target = 11;
        System.out.println(change(coins,target));
    }
}

/**coins = [1, 2, 5]    amount = 5 */