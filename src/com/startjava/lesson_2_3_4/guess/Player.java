package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

	private final String name;
	private int attempts = 0;
	private final int[] numbers = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAttempts() {
		return attempts;
	}

	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}

	public int getNumber() {
		return numbers[attempts];
	}

	public void addNumbers(int number) {
		numbers[attempts] = number;
	}

	public int[] getEnteredNumbers() {
		return Arrays.copyOf(numbers, attempts);
	}

	public void resetArray(int length) {
		Arrays.fill(numbers,0, length, 0);
		attempts = 0;
	}
}