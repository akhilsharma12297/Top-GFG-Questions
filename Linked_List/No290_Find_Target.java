package Linked_List;

import Linked_List.No275_Sum_The_LL.Node;

public class No290_Find_Target {

	class Node {
		Node next;
		int data;
	}

	static int size = 0;
	static Node head;
	static Node tail;

	public void target(int tar) {
		Node left = head;
		boolean flag = false;
		target(head, left, tar);
	}

	public void target(Node right, Node left, int tar) {

		if (right == null || left == null) {
			return;
		}

		if ((right.data + left.data) == tar) {

			System.out.println(right.data + " + " + left.data);

		}

		target(right.next, left, tar);

		target(right, left.next, tar);
	}

}
