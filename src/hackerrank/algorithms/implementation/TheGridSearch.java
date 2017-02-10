package hackerrank.algorithms.implementation;

import java.util.Scanner;

import org.hamcrest.core.Is;

public class TheGridSearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int ti = 0; ti < T; ti++){
			int R = in.nextInt();
			int C = in.nextInt();

			String[] G = new String[R]; 
			
			for (int i = 0; i < R; i++){
				G[i] = in.next();
			}
			
			int r = in.nextInt();
			int c = in.nextInt();
			String[] P = new String[r]; 

			for (int i = 0; i < r; i++){
				P[i] = in.next();
			}
			boolean isYes = false;
			for (int i = 0; i < R; i++){
				if (G[i].indexOf(P[0]) > -1){
					System.out.println("G[" + i + "] = " + G[i]);
					System.out.println("P[0] = " + P[0]);
					int idx = G[i].indexOf(P[0]);
					System.out.println("idx = " + idx);
					int j = 0;
					isYes = true;
					while (j < P.length && i < R){
						System.out.println(">G[" + i + "] = " + G[i]);
						System.out.println(">P[" + j + "] = " + P[j]);
						System.out.println("idx1 = " + G[i].indexOf(P[j]));
						System.out.println("idx2 = " + idx);
						if (G[i].indexOf(P[j]) != idx){
							isYes = false;
						}
						j++;
						i++;
					}
				}
			}
			System.out.println(isYes?"YES":"NO");
		}

	}

}
