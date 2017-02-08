package datastructure.java.hackerrank;

import java.util.Scanner;

public class Java1DArrayP1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] myList = new int[n];

		for (int i = 0; i < n; i++) {
			myList[i] = sc.nextInt();
		}
		
		int count = 0;
		for (int i = 0; i < myList.length; i++){
			int sum = 0;
			for (int j = i; j < myList.length; j++){
				sum = sum + myList[j];
				if (sum < 0)
					count++;
			}
		}
		System.out.println(count);

	}

}
