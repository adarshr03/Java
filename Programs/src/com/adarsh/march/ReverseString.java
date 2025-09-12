package com.adarsh.march;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String st ="java is awesome";
			reverseStringAndManipulate(st);
	}

	private static void reverseStringAndManipulate(String st) {
		// TODO Auto-generated method stub
		StringBuilder bldStr = new StringBuilder(st);
		bldStr.reverse();
		String reversed =bldStr.chars().mapToObj(a->(char)a).map(a->{return a.toUpperCase(0);}).toString();
	System.out.print(reversed);
	}
	

}
