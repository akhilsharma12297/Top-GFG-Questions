package Linked_List;

public class No275_Sum_The_LL {

	class Node {
		Node next;
		int data;
	}

	static int size = 0;
	static Node Head;
	static Node tail;

	public static void add_them(No275_Sum_The_LL list, No275_Sum_The_LL list2) {

		Node temp = list.Head;

		String str = new String();

		while (temp != null) {

			str += temp.data;

			temp = temp.next;

		}

		Node temp2 = list2.Head;

		String str2 = new String();

		while (temp2 != null) {

			str2 += temp2.data;

			temp2 = temp2.next;

		}

		String ans = String.valueOf(Integer.parseInt(str) + Integer.parseInt(str2));

		No275_Sum_The_LL result = new No275_Sum_The_LL();

		for (int i = 0; i < ans.length(); i++) {

			result.addLast(ans.charAt(i));

		}

	}

	public void addLast(int data) {

		if (size == 0) {
			Node node = new Node();
			node.data = data;
			Head = node;
			tail = node;

			size++;
		}

		Node temp = new Node();

		size++;

		temp.data = data;

		temp.next = null;

		tail.next = temp;

		tail = temp;

	}

	public static void main(String[] args) {
		String str = "563";

		String str2 = "842";

		String ans = String.valueOf(Integer.parseInt(str) + Integer.parseInt(str2));

		System.out.println(ans);

	}
}
