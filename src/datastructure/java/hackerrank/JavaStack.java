package datastructure;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
	//
	private Stack st = new Stack();
	public final String[] openPar = {"{", "(", "["};
	public final String[] closePar = {"}", ")", "]"};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JavaStack js = new JavaStack();  
		while (sc.hasNext()) {
			js.st.clear();
			String input = sc.next();
			System.out.println(js.isBalanced(input));
		}
	}

	private boolean isBalanced(String input) {
		
		String[] strs = input.split("");
		for (String s:strs){
			for (String op:openPar)
				if (s.equals(op))
					st.push(op);
			
			for (String op:closePar){
				if (s.equals(op)){
					if (st.empty())
						return false;
					else
						st.pop();
				}
			}
		}
		
		if (st.empty())
			return true;
			
		return false;
	}

}
