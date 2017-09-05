package hackerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class LarrysArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for (int t = 0; t < T; t++){
            int c = 0;
            int N = in.nextInt();
            int[] A = new int[N];
            for (int n = 0; n < N; n++){
                A[n] = in.nextInt();
            }
        
            //check if there is sequence 
            int[] a = A.clone();
            Arrays.sort(a);    
            boolean isPossible = true;
            for (int aa = 1; aa < a.length; aa++){
                if (a[aa-1] != aa) {
                    isPossible = false;
                    break;
                }
            }
            if (!isPossible){
                System.out.println("NO");
                continue;
            }
            
            
            for (int j = 1; j < N; j++) {
               int key = A[j];
                int i = j-1;
                while ( (i > -1) && (A[i] > key ) ) {
                    A[i+1] = A[i];
                    i--;
                    c++;
                }
                A[i+1] = key;   
            }
                
            if(c%2==0)
                System.out.println("YES");
            else
                System.out.println("NO");

            System.out.println("");
            
            
            
        }
        
        
        
        
    }
}