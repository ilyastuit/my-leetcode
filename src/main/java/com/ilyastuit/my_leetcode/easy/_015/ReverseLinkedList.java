package com.ilyastuit.my_leetcode.easy._015;

import com.ilyastuit.my_leetcode.ListNode;

public class ReverseLinkedList {

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

        ListNode result = reverseList(first);

        System.out.println("Given: " + first);
        System.out.println("Expected result: " + third);
        System.out.println("Result: " + result);
    }

    public static ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode current = head;

        while (current != null)  {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
