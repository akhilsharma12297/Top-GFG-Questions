package Binary_Tree;

public class No322_Special_Tree_PreOrder_Traversal {
	class Node {
		int data;
		Node left;
		Node right;
	}

	static int size;
	static Node root;

	static int myidx = 0;

	public void SpecialTree(int[] Pre_values, char[] Pre_nodes) {

		SpecialTreehelper(Pre_values, Pre_nodes, myidx, Pre_values.length, root);

	}

	private Node SpecialTreehelper(int[] pre_values, char[] pre_nodes, int myidx, int length, Node node) {

		if (myidx == length) {
			return null;
		}

		node = new Node();
		node.data = pre_values[myidx];
		myidx++;

		if (pre_nodes[myidx] == 'N') {

			node.left = SpecialTreehelper(pre_values, pre_nodes, myidx, length, node.left);

			node.left = SpecialTreehelper(pre_values, pre_nodes, myidx, length, node.left);
		}
		return node;
	}

}
