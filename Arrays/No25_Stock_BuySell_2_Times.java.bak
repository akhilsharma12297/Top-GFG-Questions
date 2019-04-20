package Interview_Prep;

public class No25_Stock_BuySell_2_Times {

	public static void main(String[] args) {

		int[] arr = { 10, 22, 5, 75, 65, 80 };

		System.out.println(func(arr, 2));
	}

	public static int func(int[] arr, int k) {

		int[][] mat = new int[arr.length][k + 1];

		// zero(mat);

		for (int i = 1; i < mat.length; i++) {

			int maxdiff = -1;

			for (int j = 1; j < mat[0].length - 1; i++) {

				mat[i][j] = Math.max(mat[i - 1][j], arr[i] + maxdiff);

				maxdiff = Math.max(maxdiff, mat[i][j - 1] - arr[i]);

			}

		}

		return mat[arr.length - 1][k];

	}

	public static void zero(int[][] mat) {

		int i = 0;
		while (i < mat.length) {

			mat[0][i] = 0;

			i++;
		}

		int j = 0;
		while (j < mat[0].length) {

			mat[j][0] = 0;
			j++;
		}

	}

}
