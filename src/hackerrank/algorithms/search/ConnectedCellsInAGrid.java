package hackerrank.algorithms.search;

import java.util.Scanner;

public class ConnectedCellsInAGrid {
	 static int n, m, mtx[][];

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in = new Scanner(System.in);
	        n = in.nextInt();
	        m = in.nextInt();
	        in.nextLine();
	        mtx = new int[n][m];
	        for (int ni = 0; ni < n; ni++){
	            String[] line = in.nextLine().split(" ");
	            for (int mi = 0; mi < line.length; mi++){
	                mtx[ni][mi] = Integer.parseInt(line[mi]);
	            }
	        }
	        in.close();
	        
	        int[][] originMtx = cloneArray(mtx);
	        cloneArray(null);
	        int max = 0;
	        for (int i = 0; i < n; i++){
	            for (int j = 0; j < m; j++){
	                if (mtx[i][j] == 1)
	                    max = Math.max(max, region(i, j));
	            }
	        }
	        System.out.println(max);
	        
	        mtx = originMtx;
	        
	        printArray(mtx);
	    }
	    
	    private static int region(int i, int j){
	        if (i < 0 || j < 0 || i >= n || j >= m || mtx[i][j] == -1 || mtx[i][j] == 0 )
	            return 0;
	        mtx[i][j] = -1;
	        
	        return 1 + region(i-1, j-1) + region(i-1, j) + region(i-1, j+1) + region(i, j-1) + region(i, j+1) + 
	            region(i+1, j-1) + region(i+1, j) + region(i+1, j+1);
	    }
	    
	    private static int[][] cloneArray(int[][] src) {
	    	
	    	if (src == null)
	    		return null;
	    	
	        int length = src.length;
	        int[][] target = new int[length][src[0].length];
	        for (int i = 0; i < length; i++) {
	            System.arraycopy(src[i], 0, target[i], 0, src[i].length);
	        }
	        return target;
	    }
	    
	    private static void printArray(int[][] src){
	    	for (int i = 0; i < n; i++){
	            for (int j = 0; j < m; j++){
	                System.out.print(mtx[i][j] + " ");
	            }
	            System.out.println("");
	        }
	    } 
        
}
