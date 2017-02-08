package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class ChocolateFeast {
  
  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  int t = in.nextInt();
	  
	  for (int ti = 0; ti < t; ti++){
		  int n = in.nextInt();
		  int c = in.nextInt();
		  int m = in.nextInt();
		  
		  int mainCounter = n/c;
		  
		  int choco = mainCounter;
		  
		  while (choco >= m){
			  mainCounter += choco/m;
			  choco = choco/m + choco%m;
		  }
		  
		  System.out.println(mainCounter);
	  }
	  
	  in.close();
  }

}
