package p4;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		// 1. List allows duplicate elements.
		// 2. List maintains insertion order.

		// Alt+ Shift +R

		List list = new ArrayList();

		list.add("Banana");
		list.add("Grapes");
		list.add("Apple");
		list.add("Pineapple");
		list.add("papaya");
		list.add("Banana");

		System.out.println(list.size());// 6
		System.out.println(list);

	}

}
