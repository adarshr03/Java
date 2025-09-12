package com.adarsh.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList("java","stream","api");
		List<String> upperCaseStrings = new ArrayList<>();
		upperCaseStrings=getUsingStream(strings);
		System.out.println("USing Stream UpperCase"+upperCaseStrings );
		upperCaseStrings=getUsingLoop(strings);
		System.out.println("USing Loop UpperCase"+upperCaseStrings );
		
		
	}

	private static List<String> getUsingLoop(List<String> strings) {
		// TODO Auto-generated method stub
		List<String> upperCaseStrings = new ArrayList<>();
		for(String string:strings) {
			upperCaseStrings.add(string.toUpperCase());
		}
		
		return upperCaseStrings;
		
	}

	private static List<String> getUsingStream(List<String> strings) {
		// TODO Auto-generated method stub
		return strings.stream().map(a->a.toUpperCase()).collect(Collectors.toList());
	}

}
