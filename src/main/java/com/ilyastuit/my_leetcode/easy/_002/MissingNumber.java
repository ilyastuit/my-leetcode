package com.ilyastuit.my_leetcode.easy._002;

public class MissingNumber {
    public static void main(String[] args) {

    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        return  (n * (n + 1)) / 2 - sum(nums);
    }

    public static int sum(int[] nums) {
        int sum = 0;

        for (int element : nums) {
            sum += element;
        }

        return sum;
    }
}
