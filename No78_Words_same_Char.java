package Interview_Prep;

import java.util.Arrays;

//https://www.geeksforgeeks.org/print-words-together-set-characters/

public class No78_Words_same_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(func("akhil"));
	}

	public static void func(String[] word) {

		for (int i = 0; i < word.length; i++) {

			String key = word[i];
			
			
			

		}

	}

	/*
	 * public static String getKey(String str) { boolean[] visited = new
	 * boolean[26]; Arrays.fill(visited, false);
	 * 
	 * // store all unique characters of current // word in key for (int j = 0; j <
	 * str.length(); j++) visited[str.charAt(j) - 'a'] = true; String key = ""; for
	 * (int j = 0; j < 26; j++) if (visited[j]) key = key + (char) ('a' + j); return
	 * key; }
	 */

}
