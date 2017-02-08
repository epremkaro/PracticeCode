package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class CavityMap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		char[][] map = new char[n][n];
		char[][] initialMap = new char[n][n];
		for (int n_i=0; n_i < n; n_i++){
			String temp = in.next();
			for (int i = 0; i < temp.length(); i++){
			    map[n_i][i] = temp.charAt(i);
			    initialMap[n_i][i] = temp.charAt(i);
			}
		}
		
		for (int i = 1; i < n-1; i++){
			for (int j = 1; j < n-1; j++){
				if (isGrt(i, j, initialMap))
					map[i][j] = 'X'; 
			}
		}
		
		for (int n_i=0; n_i<n;n_i++){
			for (int n_j=0; n_j<n;n_j++){
				System.out.print(map[n_i][n_j]);
			}
			System.out.println("");
		}
	}

	private static boolean isGrt(int i, int j, char[][] map) {
		
		int main = map[i][j] - '0';
		int above = map[i-1][j] - '0';
		int below = map[i+1][j] - '0';
		int left = map[i][j-1] - '0';
		int right = map[i][j+1] - '0';
		
		if (main > above && 
				main > below &&
				main > left &&
				main > right){
			return true;
		}

		return false;
	}
}
