package p7;

public class Sample {

	static <T> void printElement(T[] arr) {

		for (T x : arr) {

			System.out.println(x);
		}
	}

	public static void main(String[] args) {

		Integer[] arr1 = { 5, 8, 3, 9, 4, 10 };
		printElement(arr1);
		System.out.println("----------------------");

		String[] arr2 = { "Java", "Python", "JavaScript" };
		printElement(arr2);
		System.out.println("----------------------");

		Double[] arr3 = { 5.7, 3.9, 2.789 };
		printElement(arr3);

	}

}
