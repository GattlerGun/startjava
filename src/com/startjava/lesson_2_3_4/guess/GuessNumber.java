package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

	private final Scanner scan = new Scanner(System.in);
	private final Player player1;
	private final Player player2;
	private boolean isWork;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void start() {
		System.out.println("\nИгра угадай число в интервале (0,100]\n");
		System.out.println("У каждого игрока по 10 попыток");
		int hiddenNum = 1 + (int) (Math.random() * 100);
		isWork = true;
		do {
			inputPlayerNumber(player1, player2, hiddenNum);
			inputPlayerNumber(player2, player1, hiddenNum);
			if((player1.getAttempts() > 10) && (player2.getAttempts() > 10)) {
				System.out.println("Увы, вы не смогли угадать число " + hiddenNum);
				player1.setAttempts(player1.getAttempts() - 1);
				player2.setAttempts(player2.getAttempts() - 1);
				isWork = false;
			}
		} while(isWork);
		player1.resetArray(player1.getAttempts());
		player2.resetArray(player2.getAttempts());
	}

	private void inputPlayerNumber(Player player1, Player player2, int hiddenNum) {
		if(isWork) {
			if(player1.getAttempts() < 10) {
				System.out.println(player1.getName() + " введите ваше число: ");
				player1.addNumbers(scan.nextInt());
				int number = player1.getNumber();
				player1.setAttempts(player1.getAttempts() + 1);
				if(number < hiddenNum) {
					System.out.println("Загаданное число больше чем число " + player1.getName());
				} else if(number > hiddenNum) {
					System.out.println("Загаданное число меньше чем число " + player1.getName());
				} else{
					outputWinMessage(player1, player2, hiddenNum);
					isWork = false;
				}
			} else if(player1.getAttempts() == 10) {
				System.out.println("У " + player1.getName() + " закончились попытки");
				player1.setAttempts(player1.getAttempts() + 1);
			}
		}
	}

	private void outputWinMessage(Player player1, Player player2, int hiddenNum) {
		System.out.println("Игрок " + player1.getName() + " угадал число " + hiddenNum + " с " + player1.getAttempts() + " попытки");
		System.out.println("Игрок " + player1.getName() + " назвал числа:\n" + Arrays.toString(player1.getEnteredNumbers()));
		System.out.println("Игрок " + player2.getName() + " назвал числа:\n" + Arrays.toString(player2.getEnteredNumbers()));
	}
}