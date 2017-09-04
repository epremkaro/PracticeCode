package hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class EmasSupercomputer {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        in.nextLine();
        char [][] K = new char[N][M];
        for (int n = 0; n < N; n++) {
        	String line = in.nextLine();
        	if (line.length() != M) {
        		System.err.println("[ERROR] Length for each line should - " + M);
        		System.exit(1);
        	}
        	Pattern pattern = Pattern.compile("[^GB]");
        	Matcher matcher = pattern.matcher(line);
        	if (matcher.find()) {
        		System.err.println("[ERROR] Only 'G' and 'B' are allowed!");
        		System.exit(1);
        	}
        	
        	for (int m = 0; m < line.length(); m++) {
        		K[n][m] = line.charAt(m);
        	}
        }
              
        
        int result = 0;
        for (int n = 1; n < N; n++) {
        	for (int m = 1; m < M; m++) {
        		int k = 0;
        		while (K[n][m-k] == 'G' && K[n-k][m] == 'G' && K[n][m+k] == 'G' && K[n+k][m] == 'G') {
        			K[n][m-k] = K[n-k][m] = K[n][m+k] = K[n+k][m] = 'x';
        			for (int x = 1; x < N; x++) {
        				for (int y = 1; y < M; y++) {
        					int kk = 0;
        					System.out.println("K[x+kk][y] = " + "x = " + x + "|" + (x+kk) + "y = " +y );
        					while (K[x][y-kk] == 'G' 
        							&& K[x-kk][y] == 'G' 
        							&& K[x][y+kk] == 'G' 
        							&& K[x+kk][y] == 'G') {
        						result = Math.max(result, (1 + 4 * k) * (1 + 4 * kk));
        						kk++;
        					}
        				}
        			}
        			k++;
        		}
        		k = 0;
        		while (K[n][m-k] == 'x' && K[n-k][m] == 'x' && K[n][m+k] == 'x' && K[n+k][m] == 'x') {
        			K[n][m-k] = K[n-k][m] = K[n][m+k] = K[n+k][m] = 'G';
        			k++;
        		}
        	}
        }
        
        
        /*
     for (int x = 1; x <= n; x++) {
        for (int y = 1;y <= m; y++){
            int r = 0;
            while (c[x + r][y] == 'G' && c[x - r][y] == 'G' &&
                   c[x][y + r] == 'G' && c[x][y - r] == 'G') {
                c[x + r][y] = c[x - r][y] = c[x][y + r] = c[x][y - r] = 'g';
                for (int X = 1; X <= n; X++) {
                    for (int Y = 1; Y <= m; Y++){
                        int R = 0;
                        while (c[X + R][Y] == 'G' && c[X - R][Y] == 'G' && 
                                c[X][Y + R] == 'G' && c[X][Y - R] == 'G') {
                            ans = max(ans, (1 + 4 * r) * (1 + 4 * R));
                            R++;
                        }
                    }
                }
                r++;
            }
            r = 0;
            while (c[x + r][y] == 'g' && c[x - r][y] == 'g' && 
                    c[x][y + r] == 'g' && c[x][y - r] == 'g') {
                c[x + r][y] = c[x - r][y] = c[x][y + r] = c[x][y - r] = 'G';
                r++;
            }
        }
    }
         * 
         */
        
        
        
    }
}