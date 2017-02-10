package hackerrank.algorithms.constructive_algorithms;

import java.util.Arrays;

public class FlippingTheMatrix {

	public static void main(String[] args) {
		
		int [] p = {1, 3, 2, 5, 3};
		
		System.out.println(Arrays.toString(p));
		reverse(p);
		System.out.println(Arrays.toString(p));
		

	}
	
	public static void reverse(int[] arr){
		
		if (arr == null || arr.length == 1)
			return;

		for (int i = 0, j = arr.length - 1; i < j; i++, j--){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

}
