package com.sml.test;

public class A0021Pro {

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null && l2 == null) {
			return null;
		}
		if (l1 == null && l2 != null) {
			return l2;
		}
		if (l1 != null && l2 == null) {
			return l1;
		}
		ListNode result;
		ListNode tmp;

		if (l1.val > l2.val) {
			result = l2;
			l2 = l2.next;
		} else {
			result = l1;
			l1 = l1.next;
		}
		tmp = result;
		while (l1 != null && l2 != null) {
			if (l1.val > l2.val) {
				result.next = l2;
				l2 = l2.next;
				result = result.next;
			} else {
				result.next = l1;
				l1 = l1.next;
				result = result.next;
			}
		}

		if (l1 != null) {
			result.next = l1;
		}
		if (l2 != null) {
			result.next = l2;
		}
		return tmp;
	}

	public static void main(String[] args) {

		ListNode listNode1 = new ListNode(2);
		ListNode listNode2 = new ListNode(3);
		ListNode listNode3 = new ListNode(4);
		ListNode listNode4 = new ListNode(6);
		ListNode listNode5 = new ListNode(8);
		ListNode listNode6 = new ListNode(9);

		listNode1.next = listNode2;
		listNode2.next = listNode3;

		listNode4.next = listNode5;
		listNode5.next = listNode6;

		ListNode listNode = mergeTwoLists(listNode1, listNode4);
		while (listNode != null) {
			System.out.println(listNode.val);
			listNode = listNode.next;
		}

	}

}
