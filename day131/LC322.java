/**Day 131 – Coin Change (Min Coins)
Concept: Find minimum coins to make amount.
Problem: Coin Change – LeetCode 322
Goal: Master unbounded knapsack variation. */

import java.util.*;
public class LC322 {
    public static int coinChange(int [] coins, int amount){
        int [] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;

        for(int i=1;i<=amount;i++){
            for(int coin: coins){
                if(coin <= i){
                    dp[i]=Math.min(dp[i],1+dp[i-coin]);
                }
            }
        }

        if(dp[amount]==amount+1){   return -1;    }
        return dp[amount];
    }
    public static void main(String[] args) {
        int [] coins = {1,2,5}; int target = 11;
        System.out.println(coinChange(coins,target));
    }
}

/**coins = [1, 2, 5]    amount = 11 */