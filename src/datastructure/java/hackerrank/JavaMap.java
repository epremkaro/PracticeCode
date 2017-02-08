package datastructure.java.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
	public static void main(String []argh)
	   {
	      Scanner in = new Scanner(System.in);
	      Map book = new HashMap();
	      int n=in.nextInt();
	      in.nextLine();
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         in.nextLine();
	         book.put(name, phone);
	      }
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	         if (book.containsKey(s))
	        	 System.out.println(s + "=" + book.get(s));
	         else
	        	 System.out.println("Not found");
	        		 
	      }
	   }

}
