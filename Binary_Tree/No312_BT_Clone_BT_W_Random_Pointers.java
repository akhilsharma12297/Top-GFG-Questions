package Binary_Tree;

import java.util.HashMap;
import java.util.Stack;

public class No312_BT_Clone_BT_W_Random_Pointers {

	class Node {
		int data;
		Node left;
		Node right;
		Node Random;
	}

	Node root;

	int size = 0;

	public No312_BT_Clone_BT_W_Random_Pointers(int[] arr) {

		Stack<Node> stack = new Stack<No312_BT_Clone_BT_W_Random_Pointers.Node>();

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

	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	static Node ntreeroot = null;

	public void cloner(Node ntree) {

		cloner(root, ntree);

		ntreeroot = ntree;

		randomsetter(ntree);
	}

	private void cloner(Node node, Node ntree) {

		if (node == null) {
			ntree = null;
			return;
		}

		map.put(node.data, node.Random.data);

		ntree.data = node.data;

		Node ln = new Node();
		ntree.left = ln;
		cloner(node.left, ln);

		Node rn = new Node();
		ntree.right = rn;
		cloner(node.right, rn);

	}

	private void randomsetter(Node ntree) {

		if (ntree == null) {
			return;
		}

		Node random = new Node();

		random = findNode(ntreeroot, (findNode(ntree.data).data));

		ntree.Random = random;

		randomsetter(ntree.left);
		randomsetter(ntree.right);

	}

	public Node findNode(int data) {

		return findNode(root, data);
	}

	private Node findNode(Node node, int data) {
		if (node == null) {
			return null;
		}

		if (data == node.data) {
			return node;
		}

		Node ans = findNode(node.left, data);
		if (ans != null) {
			return ans;
		}

		Node ans2 = findNode(node.right, data);
		if (ans2 != null) {
			return ans2;
		}
		return null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 50, 25, 12, -1, 73, -1, -1, 75, 62, -1, 87, -1, -1, -1 };
		No312_BT_Clone_BT_W_Random_Pointers bt = new No312_BT_Clone_BT_W_Random_Pointers(arr);

		bt.display();

		int[] arr2 = { 0 };

		No312_BT_Clone_BT_W_Random_Pointers newtree = new No312_BT_Clone_BT_W_Random_Pointers(arr2);

		bt.cloner(newtree.root);

	}

}
