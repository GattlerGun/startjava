package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

	private final String name;
	private int attempts;
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
		return numbers[attempts - 1];
	}

	public void addNumber(int number) {
		numbers[attempts - 1] = number;
	}

	public int[] getEnteredNumbers() {
		return Arrays.copyOf(numbers, attempts);
	}

	public void reset() {
		Arrays.fill(numbers, 0, attempts, 0);
		attempts = 0;
	}
}
