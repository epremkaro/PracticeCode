package hackerrank.algorithms.sorting;

import java.util.Scanner;

public class IntroToTutorialChallenges {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int V = in.nextInt();
        int n = in.nextInt();
        int ar[] = new int[n];
        for (int ni = 0; ni < n; ni++){
            ar[ni] = in.nextInt();
        }
        System.out.println(nSearch(ar, V));
        in.close();
    }
    
    private static int nSearch (int[] ar, int v){
        return printIdx(ar, v, 0, ar.length-1);
    }
        
    
    private static int printIdx(int[] ar, int v, int start, int end){
        if (start > end)
            return -1;
        
        int mid = (end + start) / 2;
            
        if (ar[mid]==v)
            return mid;
        else if (ar[mid] > v) 
        	return printIdx(ar, v, start, mid-1);
        else
        	return printIdx(ar, v, mid+1, end);
    }

}
