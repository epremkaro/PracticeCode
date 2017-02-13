package hackerrank.algorithms.strings;

import java.util.Scanner;

public class PalindromeIndex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int ti = 0; ti <T; ti++){
			String S = in.next();
			if (isPalindrom(S)) {
				System.out.println(-1);
			}
			else{
				for (int i = 0; i < S.length(); i++) {
					StringBuilder ss = new StringBuilder(S);
					if (S.charAt(i) != S.charAt(S.length() - i - 1)) {
						if (isPalindrom(ss.deleteCharAt(i).toString())) {
							System.out.println(i);
						} else
							System.out.println(S.length() - i - 1);
						break;
					}
				}
			}
			
		}
		in.close();
	}
	
	public static boolean isPalindrom(String s){
	    StringBuilder sb = new StringBuilder();
	        sb = sb.append(s);
	        sb = sb.reverse();
	        String n = sb.toString();
	       if(n.equals(s)){
	           return true;
	       }
	    else return false;
	}

}
