package com.adarsh.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Skip2Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,3,4,5,6,7,8,9);
		List<Integer> skippedList = new ArrayList<>();
		skippedList =skipUsingStream(list);
		System.out.println("Skip using stream " +skippedList);
		skippedList =skipUsingArrayFn(list);
		System.out.print("Skip using Array fn " +skippedList);
		

	}

	private static List<Integer> skipUsingArrayFn(List<Integer> list) {
		
		return list.subList(2, list.size());
	}

	private static List<Integer> skipUsingStream(List<Integer> list) {
		
		return list.stream().skip(2).collect(Collectors.toList());
	}

	

}
