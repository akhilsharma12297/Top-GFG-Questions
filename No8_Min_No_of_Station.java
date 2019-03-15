package Interview_Prep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

///https://www.geeksforgeeks.org/minimum-number-platforms-required-railwaybus-station/

public class No8_Min_No_of_Station {

	public static void main(String[] args) {

		String arr[] = { "9:00", "9:40", "9:50", "11:00", "15:00", "18:00" };
		String dep[] = { "9:10", "12:00", "11:20", "11:30", "19:00", "20:00" };
		int[] arrival = new int[arr.length];
		int[] departure = new int[dep.length];

		for (int j = 0; j < arr.length; j++) {

			StringBuilder change = new StringBuilder(arr[j]);

			for (int i = 0; i < change.length(); i++) {

				if (change.charAt(i) == ':') {
					change.deleteCharAt(i);
				}
			}

			arrival[j] = Integer.parseInt(change.toString());

		}

		for (int j = 0; j < dep.length; j++) {

			StringBuilder change = new StringBuilder(dep[j]);

			for (int i = 0; i < change.length(); i++) {

				if (change.charAt(i) == ':') {
					change.deleteCharAt(i);
				}
			}

			departure[j] = Integer.parseInt(change.toString());

		}

//		int[] time = new int[arrival.length + departure.length];
//
//		for (int i = 0; i < arrival.length; i++) {
//			time[i] = arrival[i];
//		}
//
//		int j = arrival.length;
//
//		for (int i = 0; i < departure.length; i++) {
//			time[j] = departure[i];
//			j++;
//		}
//
//		Arrays.sort(time);
//
////
////		TreeMap<Integer, Boolean> map = new TreeMap<Integer, Boolean>();
////
////		for (int i = 0; i < arrival.length; i++) {
////			map.put(arrival[i], true);
////		}
////
////		for (int i = 0; i < departure.length; i++) {
////			map.put(departure[i], false);
////		}
////
////		System.out.println(map);
//		

		int i = 0;
		int j = 0;
		int platform = 0;
		int result = 0;
		while (i < arrival.length && j < departure.length) {

			if (arrival[i] <= departure[j]) {
				platform++;
				i++;

				if (platform > result) {
					result = platform;
				}

			} else {

				platform--;
				j++;

			}

		}

		System.out.println(result);

	}

}
