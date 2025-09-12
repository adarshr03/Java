package com.adarsh.arrays;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {89,7,1,2,9};
		printSortedArray(a);
		//sortArrayStrams(a);
	}
public static void printSortedArray(int [] args) {
	Arrays.sort(args);
	for(int i:args) {
		System.out.print(i+ " ");
	}
}
public static void sortArrayStrams(int args[]) {
	Arrays.stream(args).sorted().forEach(a->System.out.print(a+ ""));
}
} 
