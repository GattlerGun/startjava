package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

	private final Scanner scan = new Scanner(System.in);
	private final Player player1;
	private final Player player2;
	private int hiddenNum;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void start() {
		System.out.println("\nИгра угадай число в интервале (0,100]\n");
		System.out.println("У каждого игрока по 10 попыток");
		hiddenNum = 1 + (int) (Math.random() * 100);
		do {
			if(isWin(player1)) {
				break;
			}
			if(isWin(player2)) {
				break;
			} else if(player2.getAttempts() == 10){
				System.out.println("Увы, вы не смогли угадать число " + hiddenNum);
				break;
			}
		} while(true);
		player1.reset();
		player2.reset();
	}

	private void inputNumber(Player player) {
		System.out.println(player.getName() + " введите ваше число: ");
		player.setAttempts(player.getAttempts() + 1);
		player.addNumber(scan.nextInt());
	}

	private boolean checkNumber(Player player) {
		if(player.getNumber() == hiddenNum) {
			return true;
		} else {
			if(player.getNumber() < hiddenNum) {
				System.out.println("Загаданное число больше чем число " + player.getName());
			} else {
				System.out.println("Загаданное число меньше чем число " + player.getName());
			}
			return false;
		}
	}

	private boolean checkAttempts(Player player) {
		if(player.getAttempts() == 10) {
			System.out.println("У " + player.getName() + " закончились попытки");
			return false;
		} return player.getAttempts() < 10;
	}

	private void outputEnteredNumbers(Player player) {
		int[] copyNumbers = player.getEnteredNumbers();
		System.out.println(player.getName() + " назвал цифры:");
		for(int number : copyNumbers) {
			if(number != 0) {
				System.out.print(number + " ");
			}
		}
		System.out.println();
	}

	private void outputWinMessage(Player player) {
		System.out.println("Игрок " + player.getName() + " угадал число " + hiddenNum + " с " +
				(player.getAttempts()) + " попытки");
		outputEnteredNumbers(player1);
		outputEnteredNumbers(player2);
	}

	private boolean isWin(Player player) {
		inputNumber(player);
		if(checkAttempts(player)) {
			if(checkNumber(player)) {
				outputWinMessage(player);
				return true;
			}
		} return false;
	}
}