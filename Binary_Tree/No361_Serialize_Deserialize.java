package Binary_Tree;

import java.util.*;

public class No361_Serialize_Deserialize {

	class Node {
		int data;
		Node left;
		Node right;
	}

	static Node root;
	static int size;

	public No361_Serialize_Deserialize(int[] arr) {

		Stack<Node> stack = new Stack<No361_Serialize_Deserialize.Node>();

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

	public void Serialize() {
		ArrayList<Integer> idx = new ArrayList<Integer>();
		serialize(root, idx);
		idx.add(-1);
		System.out.println(idx);
	}

	private void serialize(Node node, ArrayList<Integer> idx) {

		if (node == null) {
			return;
		}

		idx.add(node.data);

		serialize(node.left, idx);

		serialize(node.right, idx);

		idx.add(-1);

	}

	static String NullSymbol = "X";

	static String Deltmiter = ",";

	public String Serialize_LEETCODE() {
		String code = Serialize_LEETCODE(root);
		System.out.println(code);
		return code;

	}

	private String Serialize_LEETCODE(Node node) {

		if (node == null) {
			return NullSymbol + Deltmiter;
		}

		String left = Serialize_LEETCODE(node.left);
		String right = Serialize_LEETCODE(node.right);

		return node.data + Deltmiter + left + right;
	}

	public Node DeSerialize_LEETCODE(String Code) {

		Queue<String> queue = new LinkedList<>();

		queue.addAll(Arrays.asList(Code.split(Deltmiter)));

		return DeSerialize_LEETCODE(queue);
	}

	private Node DeSerialize_LEETCODE(Queue<String> Serialized_Queue) {

		String nodeVal = Serialized_Queue.poll();

		if (nodeVal == NullSymbol) {
			return null;
		}
		Node node = new Node();

		node.data = Integer.valueOf(nodeVal);

		node.left = DeSerialize_LEETCODE(Serialized_Queue);

		node.right = DeSerialize_LEETCODE(Serialized_Queue);

		return node;

	}

	public static void main(String[] args) {

		int[] arr = { 50, 25, 12, -1, 73, -1, -1, 75, 62, -1, 87, -1, -1, -1 };

		No361_Serialize_Deserialize bt = new No361_Serialize_Deserialize(arr);

		bt.display();

		System.out.println();

		bt.Serialize_LEETCODE();

		System.out.println();

	}

}
