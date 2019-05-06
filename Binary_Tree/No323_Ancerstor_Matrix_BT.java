package Binary_Tree;

import java.util.ArrayList;
import java.util.HashMap;

public class No323_Ancerstor_Matrix_BT {

	class Node {
		Node left;
		Node Right;
		int data;
	}

	public void makeBT(int[][] matrix) {

		HashMap<Integer, Node> map = new HashMap<Integer, No323_Ancerstor_Matrix_BT.Node>();

		for (int i = 0; i < matrix.length - 1; i++) {

			for (int j = 0; j < matrix.length - 1; i++) {

				if (matrix[i][j] == 1) {
					Node p = new Node();

					if (!map.containsKey(i)) {
						p.data = i;
					} else {
						p = map.get(i);
					}

					Node c = new Node();
					c.data = j;

					if (p.left == null) {
						p.left = c;
					} else {
						p.Right = c;
					}

					map.put(i, p);

				}

			}
		}

		System.out.println(map);

	}

	public static void main(String[] args) {

		int[][] matrix = { { 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 1, 1, 0 }, { 0, 0, 1, 0, 0, 1, 0 } };
		No323_Ancerstor_Matrix_BT bt = new No323_Ancerstor_Matrix_BT();

	//	bt.makeBT(matrix);

		System.out.println(matrix[6][6]);

	}

}
