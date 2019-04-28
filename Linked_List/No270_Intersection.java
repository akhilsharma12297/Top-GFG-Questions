package Linked_List;

import java.util.HashSet;

public class No270_Intersection {
	class Node {
		Node next;
		int data;
	}

	Node Head;
	Node Head2;
	int size;

	static int ans = 0;

	public void Intersection() {

		Intersection(Head, Head2);

	}

	private void Intersection(Node head, Node head2) {

		if (head != null && head2 != null) {
			Intersection(head.next, head2.next);
		} else if (head != null) {
			Intersection(head, head2.next);
		} else {
			Intersection(head.next, head2);
		}

		if (head.data != head2.data) {
			ans = head.next.data;
		}
	}

	public void Intersection_visted() {
		HashSet<Integer> visited = new HashSet<Integer>();

		visited.add(Head.data);
		visited.add(Head2.data);

		Node f = Head.next;
		Node g = Head2.next;

		while (f != null) {
			if (!visited.contains(f.data)) {
				visited.add(f.data);
				f = f.next;
			} else {
				System.out.println(f.data);
				break;
			}
		}

		while (g != null) {
			if (!visited.contains(f.data)) {
				visited.add(g.data);
				g = g.next;
			} else {
				System.out.println(f.data);
				break;
			}
		}

	}
}
