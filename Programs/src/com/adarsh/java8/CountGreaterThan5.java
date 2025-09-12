package com.adarsh.java8;

import java.util.Arrays;
import java.util.List;
//Program to count the number of numbers greater than 5
public class CountGreaterThan5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,5,7,9,12,13);
		int count = 0 ;
		count =countUsingStream(list);
		System.out.println("Count using streams is " +count);
		count =countUsingLoop(list);
		System.out.println("Count using loop is " +count);
		

	}

	private static int countUsingLoop(List<Integer> list) {
		int count =0 ;
			for(Integer a :list) {
				if(a>5) {
					count++;
				}
			}
			return count;
	}

	private static int countUsingStream(List<Integer> list) {
		// TODO Auto-generated method stub
		return (int)list.stream().filter(a->a>5).count();		}

}
