package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

	private final Scanner scan = new Scanner(System.in);
	private final Player player1;
	private final Player player2;
	private boolean isWork;
	private boolean isWin;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void start() {
		System.out.println("\nИгра угадай число в интервале (0,100]\n");
		System.out.println("У каждого игрока по 10 попыток");
		int hiddenNum = 1 + (int) (Math.random() * 100);
		isWin = false;
		isWork = true;
		do {
			if(!isWin) {
				inputNumber(player1);
				checkNumber(player1, hiddenNum);
				player1.setAttempts(player1.getAttempts() + 1);
			}
			if(!isWin) {
				inputNumber(player2);
				checkNumber(player2, hiddenNum);
				player2.setAttempts(player2.getAttempts() + 1);
			}
		} while(isWork);
		if(!isWin) {
			System.out.println("Увы, вы не смогли угадать число " + hiddenNum);
		}
		player1.resetArrayAndAttempts();
		player2.resetArrayAndAttempts();
	}

	private void inputNumber(Player player) {
		System.out.println(player.getName() + " введите ваше число: ");
		player.addNumbers(scan.nextInt());
	}

	private void checkNumber(Player player, int hiddenNum) {
		if(isWin) {
			if(player.getAttempts() < 9) {
				int number = player.getNumber();
				if(player.getNumber() == hiddenNum) {
					outputWinMessage(hiddenNum);
					isWin = true;
					isWork = false;
				} else {
					if(number < hiddenNum) {
						System.out.println("Загаданное число больше чем число " + player.getName());
					} else if(number > hiddenNum) {
						System.out.println("Загаданное число меньше чем число " + player.getName());
					}
				}
			} else if(player.getAttempts() == 9) {
				System.out.println("У " + player.getName() + " закончились попытки");
				player.setAttempts(player.getAttempts() + 1);
			}
			if(player.getAttempts() > 9) {
				loseGame(player);
			}
		}
	}

	private void loseGame(Player player) {
		player.setAttempts(player.getAttempts() - 1);
		isWork = false;
	}

	private void outputEnteredNumber(Player player) {
		int[] numbersCopy = player.getEnteredNumbers();
		for(int number : numbersCopy) {
			if(number != 0) {
				System.out.print(number + " ");
			}
		}
	}
	private void outputWinMessage(int hiddenNum) {
		if(player1.getNumber() == hiddenNum) {
			System.out.println("Игрок " + player1.getName() + " угадал число " + hiddenNum + " с " +
					(player1.getAttempts() + 1) + " попытки");
		} else if(player2.getNumber() == hiddenNum){
			System.out.println("Игрок " + player2.getName() + " угадал число " + hiddenNum + " с " +
					(player2.getAttempts() + 1)  + " попытки");
		}
		System.out.print("Игрок " + player1.getName() + " назвал числа:\n");
		outputEnteredNumber(player1);
		System.out.print("\nИгрок " + player2.getName() + " назвал числа:\n");
		outputEnteredNumber(player2);
		System.out.println();
	}
}