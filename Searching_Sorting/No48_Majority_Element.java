package Searching_Sorting;

//https://www.geeksforgeeks.org/majority-element/

public class No48_Majority_Element {
	public static void main(String[] args) {

		int a[] = new int[] { 2, 2, 2, 2, 5, 5, 2, 3, 3 };

		findMajority(a);

	}

	public static void findMajority(int[] arr) {

		int m = arr[0];

		int mctr = 1;

		for (int i = 0; i < arr.length; i++) {
			if (m == arr[i]) {
				mctr++;
			} else {
				if (mctr == 0) {
					m = arr[i];
					mctr = 1;
				} else {
					mctr -= 1;
				}
			}
		}

		int ans = 0;
		mctr = 0;

		for (int i = 0; i < arr.length; i++) {
			if (m == arr[i]) {
				ans++;
				mctr++;
			}
		}

		if (ans > arr.length / 2) {
			System.out.println(m + " -> " + mctr);
		} else {
			System.out.println("NA");
		}

	}
}
