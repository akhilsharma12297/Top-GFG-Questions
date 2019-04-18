package Interview_Prep;

public class No2_Find_Sum_subarray {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 20, 3, 10, 5 };

		int sum = 33;

		Subarray_sum(arr, sum);

	}

	public static void Subarray_sum(int[] arr, int sum) {

		int mysum = 0;
		int adder = 0;
		int sub = 0;
		while (mysum != sum) {

			if (sum > mysum) {
				adder++;

				if (adder > arr.length) {
					System.out.println("Out of bound");
					break;
				}
				mysum += arr[adder];
			} else if (sum < mysum) {

				sub++;
				if (sub > arr.length) {
					System.out.println("Out of bound");

					break;
				}
				mysum -= arr[sub];
			}

		}

		System.out.println(sub + 1 + "." + adder);

	}

}
