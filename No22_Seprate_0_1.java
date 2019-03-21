package Interview_Prep;

//https://www.geeksforgeeks.org/segregate-0s-and-1s-in-an-array-by-traversing-array-once/

import java.util.Scanner;

public class No22_Seprate_0_1 {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };

		int[] res = func(arr);

		for (int i : res) {
			System.out.print(i + " ");
		}

		System.out.println("     " + arr.length + " 46");
	}

	public static int[] func(int[] arr) {

		int start = 0;

		int end = arr.length - 1;

		int i = 0;

		int zctr = 0;

		for (int j = 0; j < arr.length; j++) {

			if (arr[j] == 0) {
				zctr++;
			}

		}

		int[] res = new int[arr.length];

		for (int j = 0; j < arr.length; j++) {

			if (zctr == 0) {
				res[j] = 1;
			} else {

				res[j] = 0;
				zctr--;
			}

		}

		return res;

	}

}
