package Arrays;

//https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/

public class No23_Sort_0_1_2 {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		func(arr);

		for (int x : arr) {
			System.out.print(x + "  ");
		}
	}

	public static void func(int[] arr) {

		int start = 0;

		int zeroctr = -1;

		int end = arr.length - 1;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < 1) {
				int temp = arr[i];

				arr[i] = arr[start];

				arr[start] = temp;

				zeroctr++;

				start++;
			}

		}

		for (int x = arr.length - 1; x > zeroctr; x--) {

			if (arr[x] > 1) {
				int temp = arr[x];

				arr[x] = arr[end];

				arr[end] = temp;

				end--;
			}

		}

	}

}
