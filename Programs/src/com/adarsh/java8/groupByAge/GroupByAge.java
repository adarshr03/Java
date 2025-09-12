package com.adarsh.java8.groupByAge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people =Arrays.asList(new Person("Adarsh",27),new Person("BAlram",27),new Person("Amma",57),new Person("Achan",57));
		Map<Integer,List<Person>> list =new HashMap<>();
		list =usingStream(people);
		System.out.println("Grouped By Age "+list);
		list =usingLoop(people);
		System.out.println("Grouped By Age "+list);		
		//Map<Integer,List<Person>> list = people.stream().collect(Collectors.groupingBy(Person::getAge));
	
	}

	private static Map<Integer, List<Person>> usingLoop(List<Person> people) {
		// TODO Auto-generated method stub
		Map <Integer,List<Person>> groupedByAge = new HashMap<>();
		for(Person p: people) {
			groupedByAge.putIfAbsent(p.getAge(), new ArrayList<>());
			groupedByAge.get(p.getAge()).add(p);
		}
		return groupedByAge;
	}

	private static Map<Integer, List<Person>> usingStream(List<Person> people) {
		// TODO Auto-generated method stub
		Map<Integer,List<Person>> grpList = people.stream().collect(Collectors.groupingBy(Person::getAge));
		return grpList;
	}

}
