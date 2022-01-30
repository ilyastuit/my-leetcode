package com.ilyastuit.my_leetcode.easy._018;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int expectedResult = 4;
        int result = search(nums, target);

        System.out.println("Given: " + Arrays.toString(nums) + ", target = " + target);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Result: " + result);
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] > target) {
                right = middle - 1;
            }
            if (nums[middle] < target) {
                left = middle + 1;
            }
        }

        return -1;
    }
}
