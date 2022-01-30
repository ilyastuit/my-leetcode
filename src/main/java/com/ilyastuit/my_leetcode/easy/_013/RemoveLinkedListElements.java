package com.ilyastuit.my_leetcode.easy._013;

import com.ilyastuit.my_leetcode.ListNode;

public class RemoveLinkedListElements {

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode second2 = new ListNode(6);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        first.next = second;
        second.next = second2;
        second2.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        int val = 6;

        ListNode result = removeElements(first, val);

        System.out.println("Given: " + first);
        System.out.println("Expected result: " + first);
        System.out.println("Result: " + result);
    }

    public static ListNode removeElements(ListNode head, int val) {

        ListNode result = new ListNode(0);
        result.next = head;

        ListNode current = result;
        while (current.next != null) {

            if (current.next.val == val) {
                ListNode temp = current.next;
                current.next = current.next.next;
                temp.next = null;
            } else {
                current = current.next;
            }
        }

        return result.next;
    }
}
