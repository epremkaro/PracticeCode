package datastructure.java.hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashset {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Set<String> set = new HashSet<String>();
		int uninumber = 0;
		while(T != 0){
			String name = sc.next();
			String surname = sc.next();
			set.add(name + "," + surname);
			if (uninumber == set.size())
				
			
			System.out.println("name" + name);
			System.out.println("sname" + surname);
			T--;
		}
		sc.close();

	}

}
