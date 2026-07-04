public class LC121 {    // 7,1,5,3,6,4
    public static int maxProfit(int[] prices) {
        int minCost=prices[0];
        int max=prices[0];
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if( prices[i]<minCost){  minCost= prices[i];}
            max = prices[i];
            if((max-minCost) > maxProfit){
                maxProfit=max-minCost;
            }
        }return maxProfit;
    }
    public static int maxProfit2(int[] prices) {
        int profit = 0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]-prices[i]>profit){  profit=prices[j]-prices[i];}
            }
        }return profit;
    }
    public static int maxProfit3(int[] prices) {
        int profit = 0;
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1]){
                profit = prices[i] - prices[i-1];
                if(profit>maxProfit){ maxProfit=profit;}
            }
        }return maxProfit;
    }

    public static void main(String[] args) {
        // int[] prices = {7,1,5,3,6,4}; // Output: 5
        int[] prices = {7,6,4,3,1};
        System.out.println("Max Profit: "+maxProfit(prices));
    }
    
}

/** Mistakes:
1. cant think, how to remove one of two for loops.
2. cant find max and min numbers.
3. i was trying to compare last to first element which is of no need.
4. i never thought that min is always before max, because i have to buy first and then sell, so min will always be before max.
 */
/**
Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 */