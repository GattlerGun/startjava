package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

	private final Scanner scan = new Scanner(System.in);
	private final Player player1;
	private final Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void start() {
		System.out.println("\nИгра угадай число в интервале (0,100]\n");
		System.out.println("У каждого игрока по 10 попыток");
		int hiddenNum = 1 + (int) (Math.random() * 100);
		int attemptsPlayer1 = 0;
		int attemptsPlayer2 = 0;
		do {
			if(attemptsPlayer1 < 10) {
				System.out.println(player1.getName() + " введите ваше число: ");
				player1.setNumberArray(scan.nextInt());
				attemptsPlayer1++;
				if (player1.getNumber() < hiddenNum) {
					System.out.println("Загаданное число больше чем число " + player1.getName());
				} else if (player1.getNumber() > hiddenNum) {
					System.out.println("Загаданное число меньше чем число " + player1.getName());
				} else {
					outputWinMessage(player1, player2, hiddenNum, attemptsPlayer1, attemptsPlayer2);
					break;
				}
			} else if(attemptsPlayer1 == 10) {
				System.out.println("У " + player1.getName() + " закончились попытки");
				attemptsPlayer1++;
			}

			if(attemptsPlayer2 < 10) {
				System.out.println(player2.getName() + " введите ваше число: ");
				player2.setNumberArray(scan.nextInt());
				attemptsPlayer2++;
				if (player2.getNumber() < hiddenNum) {
					System.out.println("Загаданное число больше чем число " + player2.getName());
				} else if (player2.getNumber() > hiddenNum) {
					System.out.println("Загаданное число меньше чем число " + player2.getName());
				} else {
					outputWinMessage(player2, player1, hiddenNum, attemptsPlayer2, attemptsPlayer1);
					break;
				}
			} else if(attemptsPlayer2 == 10) {
				System.out.println("У " + player2.getName() + " закончились попытки");
				attemptsPlayer2++;
			}
			if((attemptsPlayer1 > 10) && (attemptsPlayer2 > 10)) {
				System.out.println("Увы, вы не смогли угадать число " + hiddenNum);
				attemptsPlayer1--;
				attemptsPlayer2--;
				break;
			}
		} while(true);
		player1.zeroArray(attemptsPlayer1);
		player2.zeroArray(attemptsPlayer2);
	}

	private void outputWinMessage(Player player1, Player player2, int hiddenNum, int length1, int length2) {
		System.out.println("Игрок " + player1.getName() + " угадал число " + hiddenNum + " с " + length1 + " попытки");
		player1.getIntroducedNumber(length1);
		player2.getIntroducedNumber(length2);
	}
}