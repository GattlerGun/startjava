package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {

	private Scanner scan = new Scanner(System.in);
	private int hiddenNum;
	private Player player1;
	private Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void start() {
		System.out.println("\nИгра угадай число в интервале (0,100]\n");
		int hiddenNum = 1 + (int) (Math.random() * 100);
		do {
			System.out.println(player1.getName() + " введите ваше число: ");
			player1.setNumber(scan.nextInt());
			if(player1.getNumber() < hiddenNum) {
				System.out.println("Загаданное число больше чем число " + player1.getName());
			} else if(player1.getNumber() > hiddenNum) {
				System.out.println("Загаданное число меньше чем число " + player1.getName());
			} else {
				System.out.println(player1.getName() +" вы победили! Это было число: " + hiddenNum);
				break;
			}

			System.out.println(player2.getName() + " введите ваше число: ");
			player2.setNumber(scan.nextInt());
			if(player2.getNumber() < hiddenNum) {
				System.out.println("Загаданное число больше чем число " + player2.getName());
			} else if(player2.getNumber() > hiddenNum) {
				System.out.println("Загаданное число меньше чем число " + player2.getName());
			} else {
				System.out.println(player2.getName() +" вы победили! Это было число: " + hiddenNum);
				break;
			}
		} while(true);
	}
}