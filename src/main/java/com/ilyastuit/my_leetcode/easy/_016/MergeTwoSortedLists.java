package com.ilyastuit.my_leetcode.easy._016;

import com.ilyastuit.my_leetcode.ListNode;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode first1 = new ListNode(1);
        ListNode second1 = new ListNode(2);
        ListNode third1 = new ListNode(4);

        ListNode first2 = new ListNode(1);
        ListNode second2 = new ListNode(3);
        ListNode third2 = new ListNode(4);

        first1.next = second1;
        second1.next = third1;

        first2.next = second2;
        second2.next = third2;

        ListNode result = mergeTwoLists(first1, first2);

        System.out.println("Given1: " + first1);
        System.out.println("Given2: " + first2);
        System.out.println("Result: " + result);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode(0);
        ListNode result = merged;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                merged.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                merged.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            merged = merged.next;
        }

        while (list1 != null) {
            merged.next = new ListNode(list1.val);
            list1 = list1.next;
            merged = merged.next;
        }

        while (list2 != null) {
            merged.next = new ListNode(list2.val);
            list2 = list2.next;
            merged = merged.next;
        }

        return result.next;
    }
}
