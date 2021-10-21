package p1;

public class Sample1 {

	public static void main(String[] args) {

		System.out.println("Hello Friends...");

		greet();

		Sample2 sample2 = new Sample2();
		sample2.m1();

	}

	// CTRL+SHIFT+G -> Find USAGES
	// CTRL + O -> SHOW the content of Class
	// CTRL +SHIFt+T -> Find Type(Class/Interface/Enum)

	private static void greet() {

		System.out.println("Good AfterNoon");
	}

}
