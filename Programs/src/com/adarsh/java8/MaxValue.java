package com.adarsh.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxValue {

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(1,2,3,99,5,6,7,2);
		int max ;
		max=maxValueUsingStream(list).orElse(0);
		System.out.println("The maximum num using Stream is "+max);
		max=maxValueUsingLoop(list);
		System.out.println("The maximum num using Iterator is "+max);
	}

	private static Optional<Integer> maxValueUsingStream(List<Integer> list) {

		return list.stream().max(Integer::compare);
	}

	private static int maxValueUsingLoop(List<Integer> list) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE ;
		for(Integer a :list) {
			if(a>max) {
				max =a;
			}
		}
		return max;
	}

}
