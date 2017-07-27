package hackerrank.java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrLeftRot {
	
	public static int numberNeeded(String first, String second) {
        int number = 0;
        int a[] = new int[26];
        for (int i=0; i < a.length; i++)
                a[first.charAt(i)-'a']++;
        
        for (int i = 0; i < second.length(); i++)
                a[second.charAt(i)-'a']--;
        
        for (int i = 0; i < 26; i++)
            number += Math.abs(a[i]);
        
        return number;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }

}
