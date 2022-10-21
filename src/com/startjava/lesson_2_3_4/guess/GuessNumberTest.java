package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		String playerAnswer = "yes";
		Player player1 = createPlayer("Первый");
		Player player2 = createPlayer("Второй");
		Player player3 = createPlayer("Третий");
		Player[] players = {player1, player2, player3};
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

	private static Player createPlayer(String order) {
		System.out.println(order + " игрок введите ник: ");
		return new Player(scan.nextLine());
	}
}