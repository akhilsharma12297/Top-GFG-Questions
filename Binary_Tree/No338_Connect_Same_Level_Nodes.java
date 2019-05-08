package Binary_Tree;

import java.util.LinkedList;

public class No338_Connect_Same_Level_Nodes {
	class Node {
		Node left;
		Node right;
		Node next;
		int data;
	}

	static Node root;

	public void line_connect() {
		LinkedList<Node> queue = new LinkedList<No338_Connect_Same_Level_Nodes.Node>();

		queue.addLast(root);

		queue.add(null);

		while (!queue.isEmpty()) {

			Node temp = queue.pop();

			if (temp != null) {
				temp.right = queue.peek();

				if (temp.left != null) {
					queue.addLast(temp.left);
				}

				if (temp.right != null) {
					queue.addLast(temp.right);
				}
			}

			if (queue.isEmpty()) {
				queue.addLast(null);
			}

		}

	}
}
