package Binary_Tree;

import java.util.Stack;

public class No349_Inverse_Tree {

	class Node {
		Node left;
		Node right;
		int data;

	}

	static Node root;
	static int size = 0;

	public No349_Inverse_Tree(int[] arr) {
		Stack<Node> stack = new Stack<No349_Inverse_Tree.Node>();

		for (int val : arr) {

			if (val == -1) {
				stack.pop();
			} else {
				Node node = new Node();
				node.data = val;

				size++;

				if (stack.size() == 0) {
					root = node;
				}

				if (stack.size() > 0) {
					if (stack.peek().left == null) {
						stack.peek().left = node;

					} else {
						stack.peek().right = node;
					}
				}

				stack.push(node);
			}

		}
	}

	public void display() {

		display(root);

	}

	private void display(Node node) {

		if (node == null) {
			return;
		}
		String str = new String();

		str += node.left != null ? node.left.data : ".";

		str += "<- " + node.data + " -> ";

		str += node.right != null ? node.right.data : ".";

		System.out.println(str);

		display(node.left);
		display(node.right);

	}

	public void inverse() {

		inverse(root);

	}

	private void inverse(Node node) {

		if (node == null) {
			return;
		}

		if (node.left != null && node.right != null) {

			int temp = node.left.data;

			node.left.data = node.right.data;

			node.right.data = temp;
		}

		inverse(node.left);

		inverse(node.right);

	}

	public static void main(String[] args) {

		int[] arr = { 50, 25, 12, -1, 73, -1, -1, 75, 62, -1, 87, -1, -1, -1 };

		No349_Inverse_Tree bt = new No349_Inverse_Tree(arr);

		bt.display();

		System.out.println();

		bt.inverse();

		System.out.println();

		bt.display();
	}

}
