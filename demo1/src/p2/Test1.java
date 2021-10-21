package p2;

public class Test1 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i < 11; i++) {
			sum = sum + i;
		}
		greet();

		System.out.println("Sum = " + sum);

	}

	private static void greet() {
		System.out.println("Hello JAVA");

	}

}
