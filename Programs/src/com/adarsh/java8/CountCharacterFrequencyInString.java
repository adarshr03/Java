package com.adarsh.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountCharacterFrequencyInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word ="aaabbbcccdddadarsh";
		printUsingStreams(word);
		printUsingNormalMethod(word);
		

	}

	private static void printUsingNormalMethod(String word) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> charCount = new HashMap<>();
		char characters [] =word.toCharArray();
		for(char a :characters) {
			if(charCount.containsKey(a)) {
				charCount.put(a, charCount.get(a)+1);
				
			}else {
				charCount.put(a, 1);
			}
		}
		
		for(Map.Entry<Character, Integer>  entry:charCount.entrySet()) {
			System.out.println(entry.getKey() + " : " +entry.getValue());
		}
		
		
	}

	private static void printUsingStreams(String word) {
		// TODO Auto-generated method stub
		System.out.println( "words as chars"+word.chars());
		Map<Character,Long> countSet = word.chars()// It converts the string into a stream of characters using word.chars(), which returns an IntStream
				.mapToObj(a->(char)a)// The mapToObj(a -> (char)a) converts each integer (character code) back to a Character object.
				.collect(Collectors.groupingBy(c->c,Collectors.counting()));
		countSet.forEach((k,v)->System.out.println(k + ":" +v));
	}

}
