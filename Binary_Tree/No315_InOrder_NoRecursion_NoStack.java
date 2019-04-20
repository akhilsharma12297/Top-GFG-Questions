package Binary_Tree;

import Binary_Tree.No314_InOrder_NoRecursion.Node;

public class No315_InOrder_NoRecursion_NoStack {

	class Node {
		int data;
		Node left;
		Node right;
	}

	static Node root;

	public static void func() {

		Node curr = root;

		Node pre = null;

		while (curr != null) {

			if (curr.left == null) {

				System.out.println(curr.data + " ");

				curr = curr.right;
			} else {

				pre = curr.left;

				while (pre.left != null && pre.right != curr) {

					pre = pre.right;

					if (pre.right == null) {
						pre.right = curr;
						curr = curr.left;

					} else {

						pre.right = null;
						System.out.println(curr.data + " ");
						curr = curr.right;

					}
				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
