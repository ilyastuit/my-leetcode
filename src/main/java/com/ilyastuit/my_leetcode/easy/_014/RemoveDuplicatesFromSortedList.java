package com.ilyastuit.my_leetcode.easy._014;

import com.ilyastuit.my_leetcode.ListNode;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);

        first.next = second;
        second.next = third;

        ListNode result = deleteDuplicates(first);

        System.out.println("Given: " + first);
        System.out.println("Expected result: " + first);
        System.out.println("Result: " + result);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
                ListNode temp = current.next;
                current.next = current.next.next;
                temp.next = null;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
