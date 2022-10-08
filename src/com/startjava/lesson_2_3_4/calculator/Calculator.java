package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
	
	private static int num1;
	private static int num2;
	private static String mathExp;
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
		String[] mathExpArr = mathExp.split(" ");
		num1 = (Integer.parseInt(mathExpArr[0]));
		sign = (mathExpArr[1].charAt(0));
		num2 = (Integer.parseInt(mathExpArr[2]));
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