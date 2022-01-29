package com.ilyastuit.my_leetcode.easy._003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        int[] missed = {5, 6};
        List<Integer> result = findDisappearedNumbers(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println("Expected result: " + Arrays.toString(missed));
        System.out.println("Result: " + result);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int pos = nums[i] - 1; // correct position

            if (nums[i] != nums[pos]) {
                int temp = nums[pos];
                nums[pos] = nums[i];
                nums[i] = temp;
            } else {
                i += 1;
            }
        }

        List<Integer> missed = new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                missed.add(j + 1);
            }
        }

        return missed;
    }
}
