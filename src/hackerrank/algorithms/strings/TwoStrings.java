package hackerrank.algorithms.strings;

import java.util.Scanner;

public class TwoStrings {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        for (int ci = 0 ; ci < c; ci++){
            String a = in.next();
            String b = in.next();
            
            if (a == null || b == null){
                System.out.println("NO");
                continue;
            }
            
            boolean isPrinted = false;
            for(char ch : "abcdefghijklmnopqrstuvwxyz".toCharArray()){
                if (a.indexOf(ch) > -1 && b.indexOf(ch) > -1){
                    System.out.println("YES");
                    isPrinted = true;
                    break;
                }
            }
            
            if (!isPrinted)
                System.out.println("NO");
            
            
           
        }
        
        in.close();
    }

}
