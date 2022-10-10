package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

	private static final Scanner scan = new Scanner(System.in);
	private static final String regex = "\\d+\\s([-+*/^%])\\s\\d+";
	private static final Pattern pattern = Pattern.compile(regex);
	private static int num1;
	private static int num2;
	private static char sign;

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}

	public static int calculate(String mathExp) {
		Matcher matcher;
		do {
			matcher = pattern.matcher(mathExp);
			if(!matcher.matches()) {
				System.out.println("Неверный формат: только целые положительные числа!");
				System.out.println("Доступные операции (+, -, /, *, ^, %)");
				System.out.print("Введите математическое выражение типа (a + b): ");
				mathExp = scan.nextLine();
			}
		} while(!matcher.matches());
		String[] mathExpArr = mathExp.split(" ");
		num1 = Integer.parseInt(mathExpArr[0]);
		sign = mathExpArr[1].charAt(0);
		num2 = Integer.parseInt(mathExpArr[2]);
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