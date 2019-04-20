package Arrays;

//https://www.geeksforgeeks.org/maximum-difference-between-two-elements/

public class No27_Max_Diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 3, 10, 6, 4, 8, 1 };

		func(arr);

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

}
