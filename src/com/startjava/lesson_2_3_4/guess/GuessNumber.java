package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

	private final Scanner scan = new Scanner(System.in);
	private final Player player1;
	private int hiddenNum;
	private final Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void start() {
		System.out.println("\nИгра угадай число в интервале (0,100]\n");
		System.out.println("У каждого игрока по 10 попыток");
		hiddenNum = 1 + (int) (Math.random() * 100);
		do{
			inputNumber(player1);
			if(checkAttempts(player1)) {
				if(checkNumber(player1)) {
					break;
				}
			}
			inputNumber(player2);
			if(checkAttempts(player2)) {
				if(checkNumber(player2)) {
					break;
				}
			} else {
				System.out.println("Увы, вы не смогли угадать число " + hiddenNum);
				break;
			}
		} while(true);
		player1.reset();
		player2.reset();
	}

	private void inputNumber(Player player) {
		System.out.println(player.getName() + " введите ваше число: ");
		player.addNumber(scan.nextInt());
	}

	private boolean checkNumber(Player player) {
		int number = player.getNumber();
		player.setAttempts(player.getAttempts() + 1);
		if(number == hiddenNum) {
			System.out.println("Игрок " + player.getName() + " угадал число " + hiddenNum + " с " +
					(player.getAttempts()) + " попытки");
			outputEnteredNumber(player1);
			outputEnteredNumber(player2);
			return true;
		} else if(number < hiddenNum) {
			System.out.println("Загаданное число больше чем число " + player.getName());
			return false;
		} else {
			System.out.println("Загаданное число меньше чем число " + player.getName());
			return false;
		}

	}

	private boolean checkAttempts(Player player) {
		if(player.getAttempts() == 9) {
			System.out.println("У " + player.getName() + " закончились попытки");
			return false;
		} else return player.getAttempts() < 9;
	}

	private void outputEnteredNumber(Player player) {
		int[] copyNumbers = player.getEnteredNumbers();
		System.out.println(player.getName() + " назвал цифры:");
		for(int number : copyNumbers) {
			if(number != 0) {
				System.out.print(number + " ");
			}
		}
		System.out.println();
	}
}