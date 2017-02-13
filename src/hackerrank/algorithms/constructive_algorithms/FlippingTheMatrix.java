package hackerrank.algorithms.constructive_algorithms;

import java.util.Arrays;

public class FlippingTheMatrix {

	public static void main(String[] args) {
		
		int [] p = {1, 3, 2, 5, 3};
		
		System.out.println(Arrays.toString(p));
		reverse(p);
		System.out.println(Arrays.toString(p));
		String st = "asfaas";
		int mid = st.length()/2;
		String s1 = st.substring(0, mid);
        String s2 = st.substring(mid);
        
        System.out.println(s1);
        System.out.println(s2);
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
