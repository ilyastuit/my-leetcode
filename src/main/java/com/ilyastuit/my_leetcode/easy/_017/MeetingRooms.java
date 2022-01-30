package com.ilyastuit.my_leetcode.easy._017;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {

    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        boolean expectedResult = false;
        boolean result = canAttendMeetings(intervals);

        System.out.println("Given: " + Arrays.deepToString(intervals));
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Result: " + result);
    }

    public static boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] > intervals[i + 1][0]) {
                return false;
            }
        }

        return true;
    }
}
