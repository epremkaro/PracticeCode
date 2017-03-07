package hackerrank.algorithms.strings;

import java.util.Scanner;

public class GameOfThronesI {
	public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String str = in.next();
        
        boolean isOdd = (str.length()%2 == 1) ? true : false;
        int[] letters = new int[26];
        for (int i = 0; i < str.length(); i++){
            letters[str.charAt(i)-'a']++;
        }
        
        boolean isPrinted = false;
        for (int c : letters){
            if (c % 2 == 1){
                if (isOdd)
                    isOdd = false;
                else{
                    System.out.println("NO");
                    isPrinted = true;
                    break;
                }
            }
        }
        
        if (!isPrinted)
            System.out.println("YES");
        
        
        in.close();
    }
}
