package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String playerAnswer = "yes";
		Player[] players = createPlayers(3);
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

	private static Player[] createPlayers(int numberPlayer) {
		Player[] players = new Player[numberPlayer];
		for (int i = 0; i < numberPlayer; i++) {
			System.out.println((i + 1) + " игрок введите ник: ");
			players[i] = new Player(scan.nextLine());
		}
		return players;
	}
}