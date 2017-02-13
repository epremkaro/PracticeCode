package hackerrank.algorithms.sorting;

import java.util.Scanner;

public class InsertionSortPart1 {

	public static void insertIntoSorted(int[] ar) {
        // Fill up this function 
        if (ar==null || ar.length == 1)
            return;
        
        int i = -1;
        int j = 1;
        
        for (; j < ar.length; j++){
            if (ar[j] < ar[j - 1]){
                int temp = ar[j];
                i = j - 1;
                while (i >= 0 && ar[i] > temp){
                    ar[i + 1] = ar[i];
                    i--;
                    printArray(ar);
                }
                ar[i + 1] = temp;
                printArray(ar);
            }
        }
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

}
