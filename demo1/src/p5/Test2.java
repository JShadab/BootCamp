package p5;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<Integer>();

		integers.add(10);
		integers.add(30);
		integers.add(99);
		integers.add(87);

		integers.add(2.3); // we are adding double

		System.out.println(integers);

		for (Object x : integers) {
			
			int val = (Integer) x;
			
			System.out.println(val);

		}

	}

}
