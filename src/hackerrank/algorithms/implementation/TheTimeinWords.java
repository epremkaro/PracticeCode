package hackerrank.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TheTimeinWords {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int M = in.nextInt();
		
		
		Map<Integer, String> minutes1 = new HashMap<Integer, String>();
		Map<Integer, String> minutes2 = new HashMap<Integer, String>();
		
		minutes1.put(2, "twenty");
		minutes1.put(3, "thirty");
		minutes1.put(4, "forty");
		minutes1.put(5, "fifty");
		
		minutes2.put(1, "one");
		minutes2.put(2, "two");
		minutes2.put(3, "three");
		minutes2.put(4, "four");
		minutes2.put(5, "five");
		minutes2.put(6, "six");
		minutes2.put(7, "seven");
		minutes2.put(8, "eight");
		minutes2.put(9, "nine");
		minutes2.put(10, "ten");
		minutes2.put(11, "eleven");
		minutes2.put(12, "twelve");
		minutes2.put(13, "thirteen");
		minutes2.put(14, "fourteen");
		minutes2.put(15, "quarter");
		minutes2.put(16, "sexteen");
		minutes2.put(17, "seventeen");
		minutes2.put(18, "eighteen");
		minutes2.put(19, "nineteen");
		
		String minutes = "";
		if (M == 0)
			minutes = minutes2.get(H) + " o' clock";
		else {
			if (M < 30) {
				if (minutes2.containsKey(M))
					minutes = minutes2.get(M);
				else if (minutes1.containsKey(M/10)){
					minutes = minutes1.get(M/10) + " " + (minutes2.containsKey(M%10) ? minutes2.get(M%10) : "");
				}
				if (M==15)
					minutes = minutes2.get(M);
				else
					minutes += (M==1 ? " minute":" minutes");
				
				minutes += " past " + minutes2.get(H);
			}
			else if (M == 30){
				minutes = "half past " + minutes2.get(H);
			}
			else{
				M = 60 - M;
				if (minutes2.containsKey(M))
					minutes = minutes2.get(M);
				else if (minutes1.containsKey(M/10)){
					minutes = minutes1.get(M/10) + " " + (minutes2.containsKey(M%10) ? minutes2.get(M%10) : "");
				}
				
				if (M==15)
					minutes = minutes2.get(M);
				else
					minutes += (M==1 ? " minute":" minutes");
				
				minutes += " to " + (H+1==13?minutes2.get(1):minutes2.get(H+1));
			}
		}
		System.out.println(minutes);
    }
}