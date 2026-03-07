/*
Problem: Best Time to Buy and Sell Stock

You are given an array where prices[i] represents the price of a stock on day i.

Goal:
Find the maximum profit you can achieve by buying one stock and selling it later.

Rules:
• You must buy before selling
• Only one transaction allowed

Idea:
1. Track the minimum price seen so far (buyPrice)
2. Calculate profit for each day
3. Update maximum profit if larger profit is found

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class BuySellStocks {

    public static int maxProfit(int prices[]) {

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            // update minimum buying price
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else {

                int profit = prices[i] - buyPrice;

                // update maximum profit
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }

    public static void main(String args[]) {

        int prices[] = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);

        System.out.println("Maximum Profit = " + result);
    }
}cd "C:\Users\adity\Documents\GitHub - Portfolio\Data Structures and Algorithms\03-Sorting"