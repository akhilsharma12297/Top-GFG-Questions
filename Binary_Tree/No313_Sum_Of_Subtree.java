package Binary_Tree;

public class No313_Sum_Of_Subtree {

	class Node {

		int data;

		Node left;

		Node right;

	}

	class INT {
		int v;

		INT(int a) {
			v = a;
		}
	}

	public void subTreeSum() {

	}

	private int SubtreeHelper(Node node, INT ctr, int x) {

		if (node == null) {
			return 0;
		}

		int ls = SubtreeHelper(node.left, ctr, x);
		int rs = SubtreeHelper(node.right, ctr, x);
		if ((ls + rs + node.data) == x) {
			ctr.v++;
		}

		return ctr.v;

	}

	private int Subtree(Node node, int x) {

		if (node == null) {
			return 0;
		}

		INT ctr = new INT(0);
		int ls = SubtreeHelper(node.left, ctr, x);
		int rs = SubtreeHelper(node.right, ctr, x);
		if ((ls + rs + node.data) == x) {
			ctr.v++;
		}

		return ctr.v;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
