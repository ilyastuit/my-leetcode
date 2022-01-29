package com.ilyastuit.my_leetcode.easy._006;

import java.util.Arrays;

public class BestTimeToBuyAndSellStocks {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int expectedResult = 5;
        int result = maxProfit(prices);

        System.out.println("Given: " + Arrays.toString(prices));
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Result: " + result);
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currentMin = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];

            maxProfit = Math.max(maxProfit, price - currentMin);
            currentMin = Math.min(currentMin, price);
        }

        return Math.max(maxProfit, 0);
    }
}
