package p4;

import java.util.HashSet;

public class SetDemo {
	
	public static void main(String[] args) {
		
		//1. Set provides uniqueness
		//2. Set doesn't maintain any order.
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Banana");
		set.add("Grapes");
		set.add("Apple");
		set.add("Pineapple");
		set.add("papaya");
		set.add("Banana");
		
		System.out.println(set.size());
		System.out.println(set);
		
		
	}

}
