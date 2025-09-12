package com.adarsh.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> evenList; 
		// TODO Auto-generated method stub
		evenList =evenNumbersWithStream(list);
		System.out.println("Even list made from stream "+evenList);
		evenList =evenNumbersWithIterator(list);
		System.out.println("Even list made from Iterator "+evenList);
	}

	private static List<Integer> evenNumbersWithIterator(List<Integer> list) {
		
		return list.stream().filter(a->a%2==0).collect(Collectors.toList());
	}

	private static List<Integer> evenNumbersWithStream(List<Integer> list) {
		// TODO Auto-generated method stub
		List<Integer> myEvenList =new ArrayList<>();
		for(Integer a:list) {
			if(a%2==0) {
				myEvenList.add(a);
			}
		}
		return myEvenList;
	}

}
