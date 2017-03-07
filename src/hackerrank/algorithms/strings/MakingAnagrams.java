package hackerrank.algorithms.strings;

import java.util.Scanner;

public class MakingAnagrams {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();

		int delSum = 0;
		int[] abc = new int[26];
		for (int i = 0; i < a.length(); i++)
			abc[a.charAt(i) - 'a']++;

		for (int i = 0; i < b.length(); i++)
			abc[b.charAt(i) - 'a']--;

		for (int i : abc)
			delSum += Math.abs(i);

		System.out.println(delSum);

		in.close();

    }

}
