package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorTest {

	private static final Scanner scan = new Scanner(System.in);
	private static final String regex = "\\d+\\s([-+*/^%])\\s\\d+";
	private static final Pattern pattern = Pattern.compile(regex);
	public static void main(String[] args) {
		String userAnswer = "yes";
		do {
			if(userAnswer.equals("yes")) {
				System.out.println("Доступные операции (+, -, /, *, ^, %)");
				System.out.print(" = " + calculate());
			}
			System.out.println("\nХотите продолжить вычисления? [yes/no]:");
			userAnswer = scan.nextLine();
		} while(!userAnswer.equals("no"));
		scan.close();
	}

	public static int calculate() {
		Matcher matcher;
		String mathExp;
		do {
			System.out.print("Введите математическое выражение типа (a + b): ");
			mathExp = (scan.nextLine());
			matcher = pattern.matcher(mathExp);
			if(!matcher.matches()) {
				System.out.println("Неверный формат: только целые положительные числа!");
			}
		} while (!matcher.matches());
		String[] mathExpArr = mathExp.split(" ");
		int num1 = (Integer.parseInt(mathExpArr[0]));
		char sign = (mathExpArr[1].charAt(0));
		int num2 = (Integer.parseInt(mathExpArr[2]));
		return switch (sign) {
			case '+' -> num1 + num2;
			case '-' -> num1 - num2;
			case '*' -> num1 * num2;
			case '/' -> num1 / num2;
			case '^' -> (int) Math.pow(num1, num2);
			case '%' -> num1 % num2;
			default -> 0;
			};
	}
}