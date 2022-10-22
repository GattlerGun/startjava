package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

	private final Scanner scan = new Scanner(System.in);
	private final Player[] players;
	private int hiddenNumber;
	private int round = 1;
	private static final int maxNumberRound = 3;
	private static final int maxNumberAttempts = 10;

	public GuessNumber(Player... players) {
		this.players = players;
	}

	public void start() {
		castLots();
		System.out.println("\nИгра угадай число в интервале (0,100]\n");
		System.out.println("У каждого игрока по 10 попыток");
		do {
			System.out.println("Раунд: " + round);
			hiddenNumber = 1 + (int) (Math.random() * 100);
			do {
				if(isGuessed()) {
					break;
				}
			} while(outputLoseMessage());
			outputEnteredNumbers();
			reset();
			round++;
		} while(round <= maxNumberRound);
		if(checkDraw()) {
			System.out.println("У вас ничья!");
			getWinsRound();
		} else {
			checkMaxNumberWins();
		}
		resetNumberWins();
		resetRound();
	}

	private void castLots() {
		for(int i = players.length - 1; i > 1; i--) {
			int index = (int) (Math.random() * i);
			Player player = players[index];
			players[index] = players[i];
			players[i] = player;
		}
	}

	private boolean isGuessed() {
		for (Player player : players) {
			if (checkAttempts(player)) {
				inputNumber(player);
				if (compareNumbers(player.getNumber())) {
					player.setNumberWins(player.getNumberWins() + 1);
					player.setWinsRound(round);
					outputWinMessage(player);
					return true;
				}
			} else {
				System.out.println("У " + player.getName() + " закончились попытки");
			}
		}
		return false;
	}

	private void inputNumber(Player player) {
		System.out.println(player.getName() + " введите ваше число: ");
		while (!player.addNumber(scan.nextInt())) {
			System.out.println("Введенно число выходит за интервал!! \n" +
					"Введите число в интервале от 1 до 100: ");
		}
	}

	private boolean checkAttempts(Player player) {
		return player.getAttempts() < maxNumberAttempts;
	}

	private boolean compareNumbers(int number) {
		if(number == hiddenNumber) {
			return true;
		}
		String lessOrMore = (number < hiddenNumber) ? "больше" : "меньше";
		System.out.println("Загаданное число " + lessOrMore + " чем число " + number);
		return false;
	}

	private void outputWinMessage(Player player) {
		System.out.println("Игрок " + player.getName() + " угадал число " + hiddenNumber + " с " +
				(player.getAttempts()) + " попытки");
	}

	private boolean outputLoseMessage() {
		if(!checkAttempts(players[players.length - 1])) {
			System.out.println("Увы, никто из вас не смог угадать число " + hiddenNumber);
			return true;
		}
		return false;
	}

	private void outputEnteredNumbers() {
		for (Player player : players) {
			int[] copyNumbers = player.getEnteredNumbers();
			System.out.println(player.getName() + " назвал цифры:");
			for (int number : copyNumbers) {
				System.out.print(number + " ");
			}
			System.out.println();
		}
	}

	private void reset() {
		for (Player player : players) {
			player.reset();
		}
	}

	private void checkMaxNumberWins() {
		Player maxNumberWins = players[0];
		for(int i = 1; i < players.length; i++) {
			if(maxNumberWins.getNumberWins() < players[i].getNumberWins()) {
				maxNumberWins = players[i];
			}
		}
		System.out.println("По результатам " + maxNumberRound + " раундов победил : " + maxNumberWins.getName());
	}

	private boolean checkDraw() {
		Player equalNumberWins = players[0];
		for(int i = 1; i < players.length; i++) {
			if(equalNumberWins.getNumberWins() == players[i].getNumberWins()) {
				return true;
			}

		}
		return false;
	}

	private void getWinsRound() {
		for (Player player : players) {
			int[] winsRound = player.getWinsRound();
			System.out.println(player.getName() + " победил в раундах: ");
			for (int round : winsRound) {
				if (round != 0) {
					System.out.print(round + " ");
				}
			}
			System.out.println();
		}
	}

	private void resetNumberWins() {
		for(Player player : players) {
			player.setNumberWins(0);
		}
	}

	private void resetRound() {
		round = 1;
		for(Player player : players) {
			player.setWinsRound(0);
		}
	}
}