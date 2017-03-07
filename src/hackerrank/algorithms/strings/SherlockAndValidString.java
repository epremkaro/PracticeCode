package hackerrank.algorithms.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SherlockAndValidString {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String S = in.next();
        int[] letters = new int[26];
        for (int i = 0; i < S.length(); i++){
            letters[S.charAt(i) - 'a']++;
        }
       
        Set<Integer> hs = new HashSet<Integer>();
        int sum = 0;
        int count = 0;
        for (int l : letters){
        	if (l > 0){
        		hs.add(l);
        		count++;
        		sum += l;
        	}
        }
        
        int rem = sum % count;
        
        if (hs.size() == 1)
            System.out.println("YES");
        else if (hs.size() == 2){
            if (rem == 1 || count - rem == 1 || rem == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }else
            System.out.println("NO");
        
        
        in.close();
        
    }

}
