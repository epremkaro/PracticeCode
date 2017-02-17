package hackerrank.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class RunningTimeOfQuicksort {
	private static int countQ = 0;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int[] arrInsert = new int[n];
        int[] arrQuick = new int[n];
        
        for(int ni = 0; ni < n; ni++){
            arrInsert[ni] = in.nextInt();
        }
        System.arraycopy(arrInsert, 0, arrQuick, 0, arrInsert.length);

        int insertCount = getInsert(arrInsert);
        int quickCount = getQuick(arrQuick);
        
        System.out.println(insertCount - quickCount);
        
        in.close();
    }
    
    
    private static int getInsert(int[] arr){
        int count = 0;
        
        if (arr == null)
            return count;
        
        for (int j = 1; j < arr.length; j++){
            int i = j - 1;
            int temp = arr[j];
            while(i > -1 && arr[i] > temp){
                arr[i+1] = arr[i];
                i--;
                count++;
            }
            if (i + 1 != j){
                arr[i + 1] = temp;
            }
            
        }
        return count;
    }
    
    private static int getQuick(int[] arr){        
        if (arr == null)
            return 0;
        
        int leftIdx = 0;
        int rightIdx = arr.length - 1;
        getQuickSort(arr, leftIdx, rightIdx);
        return countQ;
    }
    
    private static void getQuickSort(int[] arr, int left, int right){
        if (right - left < 1)
            return;
        
        int pivot = partition(arr, left, right);
        
        getQuickSort(arr, left, pivot - 1);
        getQuickSort(arr, pivot + 1, right);
    }
    
    private static int partition(int[] arr, int left, int right){
        int i = left - 1;
        int j = left;
        while (j <= right){
            if (arr[j] <= arr[right]){
                i++;
                swap(arr, i, j);
            }
            j++;
        }
        
        return i;
    }
    
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        countQ++;
    }

}
