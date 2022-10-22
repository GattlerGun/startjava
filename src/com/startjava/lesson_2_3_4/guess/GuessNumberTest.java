package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		String playerAnswer = "yes";
		Player[] players = createPlayers();
		GuessNumber game = new GuessNumber(players);
		do {
			if(playerAnswer.equals("yes")) {
				game.start();
			}
			System.out.println("Хотите продолжить игру? [yes/no]:");
			playerAnswer = scan.next();
		} while(!playerAnswer.equals("no"));
		scan.close();
	}

	private static Player[] createPlayers() {
		System.out.println("Первый игрок введите ник: ");
		Player player1 = new Player(scan.nextLine());
		System.out.println("Второй игрок введите ник: ");
		Player player2 = new Player(scan.nextLine());
		System.out.println("Третий игрок введите ник: ");
		Player player3 = new Player(scan.nextLine());
		return new Player[]{player1, player2, player3};
	}
}