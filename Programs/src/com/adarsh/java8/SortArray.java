package com.adarsh.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortArray {
public static void main(String args[]) {
	List<Integer> list = Arrays.asList(1,5,2,3,8,1,4);
	List<Integer> sortedList = new ArrayList<>();
	sortedList =sortUsingStream(list);
	System.out.println("The sorted list with stream is "+ sortedList);
	sortedList =sortUsingCollection(list);
	System.out.print("The sorted list with collection is "+ sortedList);

}

private static List<Integer> sortUsingStream(List<Integer> sortedList) {
	// TODO Auto-generated method stub
	return sortedList.stream().sorted().collect(Collectors.toList());
	
}

private static List<Integer> sortUsingCollection(List<Integer> sortedList) {
	// TODO Auto-generated method stub
	Collections.sort(sortedList);
	return sortedList;
	
}
}
