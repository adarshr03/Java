package com.adarsh.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArrays {
	static int merged []; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3};
		int b[]= {4,5,6};
		 merged =new int[a.length+b.length];
		merged =getMergedArrayNormalMethod(a,b);//normal method
		 System.out.print("Merge using normal method is"+Arrays.toString(merged));
		merged =getMergedArrayStreamMethod(a,b);//stream method
	    System.out.println("\nMerge using stream  method is"+Arrays.toString(merged));

	}

	private static int[] getMergedArrayStreamMethod(int[] a, int[] b) {
		// TODO Auto-generated method stub
		merged = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).toArray();
		return merged;
	}

	private static int[] getMergedArrayNormalMethod(int a[],int b[]) {
		
		System.arraycopy(a, 0, merged, 0, a.length);
		System.arraycopy(b,0,merged,a.length,b.length);
		
		return merged;
	}

}
