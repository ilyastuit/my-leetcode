package com.ilyastuit.my_leetcode.easy._007;

import java.util.Arrays;

public class MaximumSubarray {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int expectedResult = 6;
        int result = maxSubArray(nums);

        System.out.println("Given: " + Arrays.toString(nums));
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Result: " + result);
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            currentSum = Math.max(currentSum + num, num);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }

}
