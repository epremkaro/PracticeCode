package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class FlatlandSpaceStations {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int m = in.nextInt();
        int[] spaces = new int[m];
        for (int mi = 0; mi < m; mi++){
            spaces[mi] = in.nextInt();
        }
        
        int max = 0;
        
        if (n != m){
        	for (int i = 0; i < n; i++){
        		int temp = Math.abs(i - spaces[0]);
        		for(int j = 0; j < m; j++){
        			temp = Math.min(temp, Math.abs(i - spaces[j]));
        		}
        		max = Math.max(temp, max);
        	}
        }
        
        System.out.println(max);
        
        in.close();

	}
}
