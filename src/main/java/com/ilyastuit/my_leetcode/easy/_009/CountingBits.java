package com.ilyastuit.my_leetcode.easy._009;

import java.util.Arrays;

public class CountingBits {

    public static void main(String[] args) {
        int n = 2;
        int[] expectedResult ={0,1,1};
        int[] result = countBits(n);

        System.out.println("Given: " + n);
        System.out.println("Expected result: " + Arrays.toString(expectedResult));
        System.out.println("Result: " + Arrays.toString(result));
    }

    public static int[] countBits(int n) {
        int[] bits = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            bits[i] = bits[i>>1] + i % 2;
        }

        return bits;
    }
}
