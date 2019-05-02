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
		boolean result = false;
		target(head, left, tar);

		if (result == false) {

			System.out.println("Not Found");
		}
	}

	public void target(Node right, Node left, int tar) {

		if (right == null) {
			return;
		}

		target(right.next, left, tar);

		if ((right.data + left.data) == tar) {

			System.out.println(right.data + " + " + left.data);

		}

	}

}
