package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
	
	private int num1;
	private int num2;
	private char sign;

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}

	public int calculate() {
		if((num1 < 0) || (num2 < 0)) {
			System.out.println("только положительные числа!!!");
			return 0;
		}
		switch(sign) {
			case '+':
				return num1 + num2;
			case '-':
				return num1 - num2;
			case '*':
				return num1 * num2;
			case '/':
				return num1 / num2;
			case '^':
				int result = 1;
				for(int i = 0; i < num2; i++) {
					result *= num1;
				}
				return result;
			case '%':
				return num1 % num2;
			default:
				System.out.println("Такой операции в калькуляторе не реализовано");
				return 0;
		}
	}
}