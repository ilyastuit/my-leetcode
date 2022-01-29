package com.ilyastuit.my_leetcode.easy._001;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};

        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueElements = new HashSet<>();

        for (int num : nums) {
            if (uniqueElements.contains(num)) {
                return true;
            }
            uniqueElements.add(num);
        }
        return false;
    }
}
