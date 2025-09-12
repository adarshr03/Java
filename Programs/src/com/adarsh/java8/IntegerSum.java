package com.adarsh.java8;

import java.util.Arrays;
import java.util.List;

public class IntegerSum {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		int sum ;	
		sum =sumFromStream(list);
		System.out.println("Sum from Stream " + sum);
		sum =sumNormalMethod(list);
		System.out.println("Sum from Normal method " + sum);

	}

	private static int sumNormalMethod(List<Integer> list) {
		int sum =0;
		for(Integer a:list) {
			sum+=a;
		}
		return sum;
	}

	private static int sumFromStream(List<Integer> list) {
		// TODO Auto-generated method stub
		
//		return list.stream().reduce(0,Integer::sum);
		
		return list.stream().reduce(0,(a,b)->a+b);
	}

}
