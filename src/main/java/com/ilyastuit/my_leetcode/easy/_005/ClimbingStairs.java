package com.ilyastuit.my_leetcode.easy._005;

public class ClimbingStairs {

    public static void main(String[] args) {
        int n = 2;
        int expectedResult = 2;
        int result = climbStairs(n);

        System.out.println("Given n=" + n);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Result: " + result);
    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return n;
        }

        int n1 = 1;
        int n2 = 2;

        for (int i = 3; i < n + 1; i++) {
            int temp = n1;
            n1 = n2;
            n2 = temp + n2;
        }

        return n2;
    }

}
