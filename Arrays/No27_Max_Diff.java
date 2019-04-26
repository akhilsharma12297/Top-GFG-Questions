package Arrays;

//https://www.geeksforgeeks.org/maximum-difference-between-two-elements/

public class No27_Max_Diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 3, 5, 6, 4, 8, 1 };

		func(arr);

		maxDiff(arr);
	}

	public static void func(int[] arr) {

		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			int diff = -1;
			for (int j = i + 1; j < arr.length; j++) {

				diff = arr[j] - arr[i];

				result = Math.max(result, diff);
			}

		}

		System.out.println(result);
	}

	public static void maxDiff(int arr[]) {

		int n = arr.length - 1;

		int diff = arr[1] - arr[0];
		int curr_sum = diff;
		int max_sum = curr_sum;

		for (int i = 1; i < n - 1; i++) {

			diff = arr[i + 1] - arr[i];

			if (curr_sum > 0)
				curr_sum += diff;
			else
				curr_sum = diff;

			if (curr_sum > max_sum)
				max_sum = curr_sum;
		}

		System.out.println(max_sum);
	}

}
