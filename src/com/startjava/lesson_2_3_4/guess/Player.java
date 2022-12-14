package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

	private final String name;
	private int attempts;
	private int numberWins;
	private final int[] winsRound = new int[3];
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

	public int getNumberWins() {
		return numberWins;
	}

	public void setNumberWins(int numberWins) {
		this.numberWins = numberWins;
	}

	public int[] getWinsRound() {
		return Arrays.copyOf(winsRound, winsRound.length);
	}

	public void setWinsRound(int round) {
		for(int i = 0; i < winsRound.length; i++) {
			if(winsRound[i] == 0) {
				winsRound[i] = round;
				break;
			}
			if(round == 0) {
				winsRound[i] = 0;
			}
		}
	}

	public int getNumber() {
		return numbers[attempts - 1];
	}

	public boolean addNumber(int number) {
		if((number > 0) && (number <= 100)) {
			numbers[attempts] = number;
			attempts++;
			return true;
		}
		return false;
	}

	public int[] getEnteredNumbers() {
		return Arrays.copyOf(numbers, attempts);
	}

	public void reset() {
		Arrays.fill(numbers, 0, attempts, 0);
		attempts = 0;
	}
}
