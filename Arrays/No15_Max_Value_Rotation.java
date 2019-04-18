package Interview_Prep;

//https://www.geeksforgeeks.org/maximum-sum-iarri-among-rotations-given-array/

public class No15_Max_Value_Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 8, 3, 1, 2 };

		System.out.println(func(arr));

	}

	public static int func(int[] arr) {

		int n = arr.length;

		int res = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;

			for (int j = 0; j < arr.length; j++) {

				int index = (i + j) % n;
				sum += j * arr[index];

			}

			res = Math.max(res, sum);

		}

		return res;

	}

}
