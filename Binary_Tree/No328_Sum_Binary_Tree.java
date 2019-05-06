package Binary_Tree;

import java.util.Stack;

import Binary_Tree.No320_Boundary_Traversal.Node;

public class No328_Sum_Binary_Tree {

	class Node {
		Node left;
		Node right;
		int data;
	}

	static Node root;
	static int size = 0;

	public No328_Sum_Binary_Tree(int[] arr) {

		Stack<Node> stack = new Stack<No328_Sum_Binary_Tree.Node>();

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

	private int sumTree(Node node) {

		if (node == null) {
			return 0;
		}

		int val = node.data;

		node.data = sumTree(node.left) + sumTree(node.right);

		return val + node.data;

	}

	public void sumTree() {
		sumTree(root);
	}

	public static void main(String[] args) {

		int[] arr = { 50, 25, 12, -1, 73, -1, -1, 75, 62, -1, 87, -1, -1, -1 };

		No328_Sum_Binary_Tree bt = new No328_Sum_Binary_Tree(arr);

		bt.display();

		System.out.println();

		bt.sumTree();

		System.out.println();

		bt.display();
	}
}
