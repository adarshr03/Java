package com.adarsh.java8.groupByAge;

public class Person {
	String name;
	int age;
Person(String name,int age){
	this.name=name;
	this.age =age;
}

public int getAge() {
	return age;
}

@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + "]";
}
}
