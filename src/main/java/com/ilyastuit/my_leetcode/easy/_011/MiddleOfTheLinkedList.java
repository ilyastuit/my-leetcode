package com.ilyastuit.my_leetcode.easy._011;

import com.ilyastuit.my_leetcode.ListNode;

public class MiddleOfTheLinkedList {

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        ListNode result = middleNode(first);

        System.out.println("Given: " + first);
        System.out.println("Expected result: " + third);
        System.out.println("Result: " + result);
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

}
