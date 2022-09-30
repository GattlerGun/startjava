package com.startjava.lesson_1.$final;

public class Calculator {
	
	public static void main(String[] args) {
		System.out.println("Калькулятор\n");
		int a = (int) (Math.random() * 10);
		int b = (int) (Math.random() * 10);
		char sign = '^';
		int result = 0;
		if((a >= 0) && (b >= 0)) {
			if(sign == '+') {
				result = a + b;
			} else if(sign == '-') {
				result = a - b;
			} else if(sign == '*') {
				result = a * b;
			} else if(sign == '/') {
				result = a / b;
			} else if(sign == '^') {
				result = 1;
				for(int i = 1; i < b; i++) {
					result *= a;
				}
			} else if(sign == '%') {
				result = a % b;
			} else {
				System.out.println("Такой операции в калькуляторе не реализовано");
			}
			System.out.println(a + " " + sign + " " + b + " = " + result);
		} else {
			System.out.println("Калькулятор считает только положительные числа");
		}
	}
} 