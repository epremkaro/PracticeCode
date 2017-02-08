package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    for(int ti = 0; ti < t; ti++){
	        String line = in.next();
	        int count = 0;

	        int i = 0, j = line.length() - 1;
	        while(i < j){
	            count += Math.abs(line.charAt(i) - line.charAt(j));
	            i++; j--;
	        }
	        System.out.println(count);
	    }
	    
	    in.close();
	}
}
