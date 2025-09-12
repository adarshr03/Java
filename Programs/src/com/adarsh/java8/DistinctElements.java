package com.adarsh.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,3,55,6,7,7,9);
		List<Integer> distinctList =new ArrayList<>();
		distinctList =distinctElementsUsingStream(list);
		System.out.println("The distinct elements using stream are " +distinctList);
		
		distinctList =distinctElementsUsingLoop(list);
		
		System.out.println("The distinct elements using loop are " +distinctList);

		

	}

	private static List<Integer> distinctElementsUsingLoop(List<Integer> list) {
		// TODO Auto-generated method stub
		List<Integer> distinctList = new ArrayList<>();
		for(Integer a:list) {
			
			if(!distinctList.contains(a)) {
				distinctList.add(a);
			}
			
		}
		return distinctList;
	}

	private static List<Integer> distinctElementsUsingStream(List<Integer> list) {
		// TODO Auto-generated method stub
		return list.stream().distinct().collect(Collectors.toList());
		
	}

}
