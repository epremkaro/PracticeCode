package bignumber.java.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	    String a = in.nextLine();
	    String b = in.nextLine();
	    
	    BigInteger aBig = new BigInteger(a).add(new BigInteger(b));
	    BigInteger bBig = new BigInteger(a).multiply(new BigInteger(b));
	    
        System.out.println(aBig.toString());
        System.out.println(bBig.toString());	    
	      
	      
	}

}
