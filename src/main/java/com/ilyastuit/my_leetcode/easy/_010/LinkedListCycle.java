package com.ilyastuit.my_leetcode.easy._010;

import com.ilyastuit.my_leetcode.ListNode;

public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode first = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;

        System.out.println("Given: " + first);
        System.out.println("Expected result: " + true);
        System.out.println("Result: " + hasCycle(first));
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow.equals(fast)) {
                return true;
            }
        }

        return false;
    }
}


