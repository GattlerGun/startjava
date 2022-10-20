package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		String playerAnswer = "yes";
		Scanner scan = new Scanner(System.in);
		System.out.println("Первый игрок введите ник: ");
		Player player1 = new Player(scan.nextLine());
		System.out.println("Второй игрок введите ник: ");
		Player player2 = new Player(scan.nextLine());
		System.out.println("Третий игрок введите ник: ");
		Player player3 = new Player(scan.nextLine());
		Player[] players = {player1, player2, player3};
		drawLots(players);
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

	private static void drawLots(Player[] players) {
		int i = players.length - 1;
		while(i > 1) {
			int k = (int) (Math.random() * i);
			Player player = players[k];
			players[k] = players[i];
			players[i] = player;
			i--;
		}
	}
}