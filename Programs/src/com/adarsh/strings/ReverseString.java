package com.adarsh.strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="adarsh";
		String reversed ;
		reversed =getReversedWithMethod(name);
		System.out.println("Reverse using String builder " +reversed);
		reversed =getReversedWithNormalMethod(name);
		System.out.println("Reverse using loop "+reversed);

	}

	private static String getReversedWithNormalMethod(String name) {
		// TODO Auto-generated method stub
		String reversed="";
		char a[] = name.toCharArray();
		char b[] = name.toCharArray();
		for(int i =a.length-1;i>=0;i--) {
			reversed =reversed +a[i];
		}
		return reversed;
	}

	private static String getReversedWithMethod(String name) {
		// TODO Auto-generated method stub
		return new StringBuilder(name).reverse().toString();
	}

}
