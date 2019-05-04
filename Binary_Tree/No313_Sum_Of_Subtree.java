package Binary_Tree;

public class No313_Sum_Of_Subtree {

	class Node {

		int data;

		Node left;

		Node right;

	}

	static Node root;

	static int ctr = 0;

	public void subTreeSumCtr(int x) {

		subTreeSumCtr(root, x);

		System.out.println(ctr);

	}

	public int subTreeSumCtr(Node node, int x) {

		if (node == null) {
			return 0;
		}

		int ls = subTreeSumCtr(node.left, x);
		int rs = subTreeSumCtr(node.right, x);

		int sum = ls + rs + node.data;

		if (sum == x) {
			ctr++;
		}

		return sum;

	}
}
