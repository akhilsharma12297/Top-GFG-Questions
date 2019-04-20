package Arrays;

public class No4_Maximum_Sum_Increasing_Subsequence {

	public static void main(String[] args) {

		int[] arr = { 1, 101, 2, 3, 100, 4, 5 };

		increasing_sub(arr);

	}

	public static void increasing_sub(int[] arr) {

		int sum = arr[0];

		for (int i = 1; arr.length > i; i++) {

			if (arr[i] > arr[i - 1]) {

				sum += arr[i];

			}

		}

		System.out.println(sum);

	}
}
