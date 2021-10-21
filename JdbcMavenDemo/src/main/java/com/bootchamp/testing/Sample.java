package com.bootchamp.testing;

public class Sample {

	public int getMin(int[] arr) {

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return min;

	}

	public boolean isEven(int x) {

		return (x % 2 == 0);

	}
	
	public String reverse(String name) {
		
		
		StringBuffer sb = new StringBuffer(name);
		
		StringBuffer revSB = sb.reverse();
		
		return revSB.toString();
	}

}
