package Binary_Tree;

import java.util.Stack;

import Binary_Tree.No321_LevelOrder_Traversal.Node;

public class No318_Diagonal_Traversal {

	class Node {
		int data;
		Node left;
		Node right;
	}

	static Node root;
	static int size;

	public No318_Diagonal_Traversal(int[] arr) {

		Stack<Node> stack = new Stack<No318_Diagonal_Traversal.Node>();

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

	public void Diagonal_Traversal() {

		Node temp = root;
		Node home = root;

		while (home != null) {

			while (temp != null) {

				System.out.print(temp.data + " ");

				temp = temp.right;

			}
			
			System.out.println();
			home = home.left;

			temp = home;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 50, 25, 12, -1, 73, -1, -1, 75, 62, -1, 87, -1, -1, -1 };

		No318_Diagonal_Traversal bt = new No318_Diagonal_Traversal(arr);

		bt.display();

		System.out.println();

		bt.Diagonal_Traversal();

	}

}
