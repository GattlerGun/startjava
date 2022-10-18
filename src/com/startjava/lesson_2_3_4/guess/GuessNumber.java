package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

	private final Scanner scan = new Scanner(System.in);
	private final Player player1;
	private final Player player2;
	private int hiddenNumber;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void start() {
		System.out.println("\nИгра угадай число в интервале (0,100]\n");
		System.out.println("У каждого игрока по 10 попыток");
		hiddenNumber = 1 + (int) (Math.random() * 100);
		do {
			if(isGuessed(player1) || isGuessed(player2)) {
				break;
			}
			if(loseGame()) {
				break;
			}
		} while(true);
		outputEnteredNumbers(player1);
		outputEnteredNumbers(player2);
		player1.reset();
		player2.reset();
	}

	private boolean isGuessed(Player player) {
		inputNumber(player);
		if(checkAttempts(player)) {
			if(checkNumber(player.getNumber())) {
				outputWinMessage(player);
				return true;
			}
		} else {
			System.out.println("У " + player.getName() + " закончились попытки");
		}
		return false;
	}

	private void inputNumber(Player player) {
		System.out.println(player.getName() + " введите ваше число: ");
		player.setAttempts(player.getAttempts() + 1);
		player.addNumber(scan.nextInt());
	}

	private boolean checkAttempts(Player player) {
		return player.getAttempts() < 10;
	}

	private boolean checkNumber(int number) {
		if(number == hiddenNumber) {
			return true;
		}
		if(number < hiddenNumber) {
			System.out.println("Загаданное число больше чем число " + number);
		} else {
			System.out.println("Загаданное число меньше чем число " + number);
		}
		return false;
	}

	private void outputWinMessage(Player player) {
		System.out.println("Игрок " + player.getName() + " угадал число " + hiddenNumber + " с " +
				(player.getAttempts()) + " попытки");
	}

	private boolean loseGame() {
		if(!checkAttempts(player2)) {
			System.out.println("Увы, вы не смогли угадать число " + hiddenNumber);
			return true;
		}
		return false;
	}

	private void outputEnteredNumbers(Player player) {
		int[] copyNumbers = player.getEnteredNumbers();
		System.out.println(player.getName() + " назвал цифры:");
		for(int number : copyNumbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
}