package p6;

public class Main {

	public static void main(String[] args) {

		MyCustom1 custom1 = new MyCustom1();
		Integer x = custom1.add(5, 10);

		System.out.println(x);

		MyCustom2 custom2 = new MyCustom2();
		String y = custom2.add("I Love ", "Java");

		System.out.println(y);

		MyCustom3 custom3 = new MyCustom3();
		Double z = custom3.add(2.5, 6.4);

		System.out.println(z);

		MyCustom<Integer> x1 = new MyCustom<>();
		x1.add(5, 10);

		MyCustom<String> y1 = new MyCustom<>();
		y1.add("I Love ", "Java");

		MyCustom<Double> z1 = new MyCustom<>();
		z1.add(2.5, 6.4);
	}

}
