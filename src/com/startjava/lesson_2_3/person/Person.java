package com.startjava.lesson_2_3.person;

public class Person {

	boolean isMale = true;
	String name = "Artem";
	double height = 1.76;
	double weight = 78;
	int age = 23;

	void move() {
		System.out.println("moving");
	}

	void sit() {
		System.out.println("sitting");
	}

	boolean run() {
		return true;
	}

	String say() {
		return "saying";
	}

	void learnJava() {
		System.out.println("learning java");
	}
}