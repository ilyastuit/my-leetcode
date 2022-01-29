package com.ilyastuit.my_leetcode.easy._004;

import java.util.Arrays;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int singleNumber = 1;
        int result = singleNumber(nums);

        System.out.println("Given: " + Arrays.toString(nums));
        System.out.println("Expected result: " + singleNumber);
        System.out.println("Result: " + result);
    }

    public static int singleNumber(int[] nums) {
        int mask = 0;

        for (int num : nums) {
            mask ^= num;
        }

        return mask;
    }
}
