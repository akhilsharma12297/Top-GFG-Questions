package Binary_Tree;

import java.util.Stack;

public class No327_Binary_Tree_to_DLL {

	class Node {
		Node left;
		Node right;
		int data;
	}

	static Node root;

	static int size;

	public No327_Binary_Tree_to_DLL(int[] arr) {
		Stack<Node> stack = new Stack<No327_Binary_Tree_to_DLL.Node>();

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

	private void printDLL(Node head) {

		Node node = head;
		do {
			System.out.print(node.data + " -> ");
			node = node.right;
		} while (node != head);

		System.out.println();

	}

	public Node concatenate(Node leftList, Node rightList) {
		if (leftList == null)
			return rightList;
		if (rightList == null)
			return leftList;

		Node leftLast = leftList.left;
		Node rightLast = rightList.left;

		leftLast.right = rightList;
		rightList.left = leftLast;

		leftList.left = rightLast;

		rightLast.right = leftList;

		return leftList;
	}

	public void btToCDLL() {
		bTreeToCList(root);
		printDLL(root);
	}

	public Node bTreeToCList(Node root) {
		if (root == null)
			return null;

		Node left = bTreeToCList(root.left);
		Node right = bTreeToCList(root.right);

		root.left = root.right = root;
		return concatenate(concatenate(left, root), right);
	}

	public static void main(String[] args) {

		int[] arr = { 7, 6, 5, -1, 4, -1, -1, 3, 2, -1, 1, -1, -1, -1 };

		No327_Binary_Tree_to_DLL bt = new No327_Binary_Tree_to_DLL(arr);

		bt.display();

		System.out.println();

		bt.btToCDLL();

		System.out.println();

	}

}
