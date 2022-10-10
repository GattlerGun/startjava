package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String userAnswer = "yes";
		do {
			if(userAnswer.equals("yes")) {
				System.out.println("Доступные операции (+, -, /, *, ^, %)");
				System.out.print("Введите математическое выражение типа (a + b): ");
				System.out.print(" = " + Calculator.calculate(scan.nextLine()));
			}
			System.out.println("\nХотите продолжить вычисления? [yes/no]:");
			userAnswer = scan.nextLine();
		} while(!userAnswer.equals("no"));
		scan.close();
	}
}