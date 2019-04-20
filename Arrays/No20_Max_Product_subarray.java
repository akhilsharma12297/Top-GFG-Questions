package Arrays;

//https://www.geeksforgeeks.org/maximum-product-subarray/

public class No20_Max_Product_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { -2, -3, 0, -2, -40 };

		func(arr);

	}

	public static void func(int[] arr) {

		int maxsum = 0;
		int sum = 1;
		int start = 0;
		int end = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = arr[i];
			for (int j = i + 1; j < arr.length; j++) {

				sum = sum * arr[j];

				if (sum > maxsum) {

					maxsum = sum;
					start = i;
					end = j;

				}

			}
		}

		System.out.println(maxsum + " " + start + " " + end);

	}

}
