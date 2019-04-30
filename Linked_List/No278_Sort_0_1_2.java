package Linked_List;

public class No278_Sort_0_1_2 {

	class Node {
		Node next;
		int data;
	}

	static int size = 0;
	static Node head;
	static Node tail;

	public void sort012() {

		int[] count = { 0, 1, 2 };

		Node temp = head;

		while (temp != null) {
			count[temp.data]++;

			temp = temp.next;
		}

		int i = 0;
		temp = head;

		while (temp != null) {

			if (count[i] == 0) {
				i++;
			} else {
				temp.data = i;
				--count[i];
				temp = temp.next;

			}

		}

	}

}
