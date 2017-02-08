package hackerrank.java.oop;

class Arithmetic {
	public int add(int a, int b) {
		return a + b;
	}
}

class Adder extends Arithmetic {

	public int add(int a, int b) {
		int sum = 0;
		sum = a + b;

		return sum;
	}
}

public class JavaInheritanceII {

	public static void main(String[] argh) {
		Adder X = new Adder();
		System.out.println("My superclass is: "
				+ X.getClass().getSuperclass().getName());
		System.out.print(X.add(10, 32) + " " + X.add(10, 3) + " "
				+ X.add(10, 10) + "\n");

		System.out.println("");
	}

	static class Arithmetic {

	}

	static class Adder extends Arithmetic {
		public int add(int x, int y) {
			return x + y;
		}

	}
}