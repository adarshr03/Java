package com.adarsh.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> list = Arrays.asList(1,1,2,3,3,4,5,6,7);
		Set <Integer> removedList = new HashSet<>();
		removedList =removeDuplicateUsingHashSet(list);
		System.out.println("Using HashSet "+removedList);
		removedList=removeDuplicateUsingStream(list);
		System.out.println("Using stream "+removedList);
		
		

	}

	private static Set<Integer> removeDuplicateUsingStream(List<Integer> list) {
		// TODO Auto-generated method stub
		return list.stream().collect(Collectors.toSet());
	}

	private static Set<Integer> removeDuplicateUsingHashSet(List<Integer> list) {
		// TODO Auto-generated method stub
	
		Set<Integer> newList = new HashSet<>(list);
		return newList;
	}

}
