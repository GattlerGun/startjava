package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

	private final String name;
	private int number;
	private final int[] numberArray = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumberArray(int number) {
		for(int i = 0; i < numberArray.length; i++) {
			this.number = number;
			if(numberArray[i] == 0) {
				numberArray[i] = number;
				break;
			}
		}
	}

	public void getIntroducedNumber(int length) {
		int[] numbersArrayCopy = Arrays.copyOf(numberArray, length);
		System.out.println("Игрок " + name + " назвал числа:\n" + Arrays.toString(numbersArrayCopy));
	}

	public void zeroArray(int length) {
		Arrays.fill(numberArray,0, length, 0);
	}
}