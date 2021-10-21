package com.bootchamp.testing;

public class Main {

	public static void main(String[] args) {

		int[] arr = { 6, 3, 9, 3, 6, 7, 5 };
		
		int[] arr2 = { 6, -3, 9, 3, 6, -7, 5, 0 };

		Sample sample = new Sample();

		int min = sample.getMin(arr);
		System.out.println(min);
		
		int min2 = sample.getMin(arr2);
		System.out.println(min2);
	}

}
