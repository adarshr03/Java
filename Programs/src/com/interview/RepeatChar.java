package com.interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java Stream API is a very good concept";
		repeatingChar(s);
	}

	private static void repeatingChar(String s) {
		char a []=s.toCharArray();
		Map <Character,Integer>characters = new LinkedHashMap<>();
		for(Character ch:a) {
			if(!characters.containsKey(ch) && (!ch.equals('\s'))) {
				characters.putIfAbsent(ch, 1);	
			}
			else if(!ch.equals('\s')) {
				characters.put(ch, characters.get(ch)+1);
			}
		
		}
		for(Map.Entry<Character,Integer> d: characters.entrySet()) {
			if(d.getValue()==1) {
				System.out.print(d.getKey());
				break;
			}
		}
		//System.out.print(characters);
	}

}
