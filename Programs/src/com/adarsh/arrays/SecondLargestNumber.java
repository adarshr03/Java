package com.adarsh.arrays;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {7,9,2,1,2,8};
		int secondLargest;
		secondLargest =getSecondLargestNoNormal(a);
		System.out.println("getSecondLargestNoNormal "+secondLargest);
		secondLargest =getSecondLargestNoStream(a);
		System.out.println("getSecondLargestNoStream "
				+ secondLargest);

	}

	private static int getSecondLargestNoStream(int[] a) {
		return Arrays.stream(a).sorted().toArray()[a.length-2];
	}

	private static int getSecondLargestNoNormal(int[] a) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		return a[a.length-2];
	}

}
