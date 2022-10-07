package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		String userAnswer = "yes";
		Scanner scan = new Scanner(System.in);
		Calculator calc = new Calculator();
		do {
			if(userAnswer.equals("yes")) {
				System.out.println("Доступные операции (+, -, /, *, ^, %)");
				System.out.print("Введите математическое выражение типа (a + b): ");
				String mathExp = scan.nextLine();
				String[] mathExpArr = mathExp.split(" ");
				calc.setNum1(Integer.parseInt(mathExpArr[0]));
				calc.setSign(mathExpArr[1].charAt(0));
				calc.setNum2(Integer.parseInt(mathExpArr[2]));
				System.out.print(" = " + calc.calculate());
			}
				System.out.println("\nХотите продолжить вычисления? [yes/no]:");
				userAnswer = scan.nextLine();
		} while(!userAnswer.equals("no"));
		scan.close();
	}
}