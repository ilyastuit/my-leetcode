package com.ilyastuit.my_leetcode.easy._012;

import com.ilyastuit.my_leetcode.ListNode;
import com.ilyastuit.my_leetcode.easy._011.MiddleOfTheLinkedList;
import com.ilyastuit.my_leetcode.easy._015.ReverseLinkedList;

public class PalindromeLinkedList {

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(1);

        first.next = second;
        second.next = third;
        third.next = fourth;

        boolean result = isPalindrome(first);

        System.out.println("Given: " + first);
        System.out.println("Expected result: " + true);
        System.out.println("Result: " + result);
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode middle = middleNode(head);
        ListNode reversed = reverseList(middle);

        while (reversed != null) {
            if (reversed.val != head.val) {
                return false;
            }

            reversed = reversed.next;
            head = head.next;
        }

        return true;
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
