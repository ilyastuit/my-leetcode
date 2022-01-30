package com.ilyastuit.my_leetcode.easy._008;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RangeSumQueryImmutable {

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        int[][] ranges = {{0, 2}, {2, 5}, {0, 5}};

        NumArray numArray = new NumArray(nums);
        int[] expectedResult = {1, -1, -3};
        int[] result = new int[3];

        result[0] = numArray.sumRange(ranges[0][0], ranges[0][1]);
        result[1] = numArray.sumRange(ranges[1][0], ranges[1][1]);
        result[2] = numArray.sumRange(ranges[2][0], ranges[2][1]);

        System.out.println("Given: " + Arrays.toString(nums));
        System.out.println("Expected result: " + Arrays.toString(expectedResult));
        System.out.println("Result: " + Arrays.toString(result));
    }

}

class NumArray {

    private final List<Integer> sums;

    public NumArray(int[] nums) {
        this.sums = new ArrayList<>();

        int currentSum = 0;
        for (int num : nums) {
            currentSum += num;
            sums.add(currentSum);
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return sums.get(right);
        }

        return sums.get(right) - sums.get(left - 1);
    }
}