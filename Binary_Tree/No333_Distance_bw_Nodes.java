package Binary_Tree;

import java.util.ArrayList;
import java.util.Stack;

import Binary_Tree.No330_Binary_Tree_To_Circular_LL.Node;

public class No333_Distance_bw_Nodes {
	class Node {
		Node left;
		Node right;
		int data;
	}

	static Node root;

	static int size;

	public No333_Distance_bw_Nodes(int[] arr) {
		Stack<Node> stack = new Stack<No333_Distance_bw_Nodes.Node>();

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

	public ArrayList<Integer> nodeToRootPath(int data) {

		return nodeToRootPath(root, data);
	}

	public ArrayList<Integer> nodeToRootPath(Node node, int data) {

		if (node == null) {
			ArrayList<Integer> bres = new ArrayList<Integer>();
			return bres;
		}
		if (node.data == data) {

			ArrayList<Integer> ans = new ArrayList<Integer>();
			ans.add(node.data);
			return ans;

		}

		ArrayList<Integer> res = nodeToRootPath(node.left, data);
		if (res.size() > 0) {
			res.add(node.data);
			return res;
		}

		res = nodeToRootPath(node.right, data);
		if (res.size() > 0) {
			res.add(node.data);
			return res;
		}

		return res;

	}

	public int LCA(int i, int j) {
		ArrayList<Integer> iList = nodeToRootPath(i);

		ArrayList<Integer> jList = nodeToRootPath(j);

		int iSize = iList.size() - 1;
		int jSize = jList.size() - 1;

		while (iSize >= 0 && jSize >= 0) {

			if (iList.get(iSize) != jList.get(jSize)) {
				return iList.get(iSize + 1);
			}

			iSize--;
			jSize--;

		}
		return -1;
	}

	public int distanceBWnode(int i, int j) {
		ArrayList<Integer> iList = nodeToRootPath(i);

		ArrayList<Integer> jList = nodeToRootPath(j);

		int x = LCA(i, j);

		ArrayList<Integer> xList = nodeToRootPath(x);

		return ((iList.size() + jList.size()) - 2 * xList.size());
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

	public static void main(String[] args) {

		int[] arr = { 50, 25, 12, -1, 73, -1, -1, 75, 62, -1, 87, -1, -1, -1 };

		No333_Distance_bw_Nodes bt = new No333_Distance_bw_Nodes(arr);

		bt.display();

		System.out.println();

		System.out.println(bt.distanceBWnode(62, 87));

	}
}
