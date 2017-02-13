package hackerrank.algorithms.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MissingNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<Integer,Integer> A = new HashMap<Integer,Integer>();
		for (int ni=0; ni < n; ni++){
			int t = in.nextInt();
			if (A.containsKey(t))
				A.put(t, A.get(t)-1);
			else
				A.put(t, -1);
		}
		
		int m = in.nextInt();
		for (int mi=0; mi < m; mi++){
			int t = in.nextInt();
			if (A.containsKey(t))
				A.put(t, A.get(t)+1);
			else
				A.put(t, 1);
		}
		
		List<Integer> missingN = new ArrayList<Integer>(101);
		for (int key:A.keySet()){
			if (A.get(key) > 0){
				missingN.add(key);
			}
		}
		
		Collections.sort(missingN);
		
		for (int num : missingN){
			System.out.print(num + " ");
		}
		
	}

}
