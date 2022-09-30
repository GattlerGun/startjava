package com.startjava.lesson_1.base;

public class IfElseStatementTheme {

	public static void main(String[] args) {
		System.out.println("1.Перевод псевдокода на язык Java\n");
		int age = 20;
		boolean isMale = true;
		double height = 1.74;
		if(age > 20) {
			System.out.println("Человек чуть старше 20");
		} else {
			System.out.println("Человек младше 20 или ему 20");
		}
		if(!isMale) {
			System.out.println("Это девушка");
		} else {
			System.out.println("Это мужчина");
		}
		if(height < 1.80) {
			System.out.println("Ниже 1.80");
		} else {
			System.out.println("Выше 1.80");
		}
		char firstCharName = "Artem".charAt(0);
		if(firstCharName == 'M') {
			System.out.println("Имя начинается на М");
		} else if(firstCharName == 'I') {
			System.out.println("Имя начинается на I");
		} else {
			System.out.println("Это имя Artem");
		}

		System.out.println("\n2.Поиск max и min числа\n");
		int num1 = 123;
		int num2 = 321;
		if(num1 == num2) {
			System.out.println("Число " + num1 +" и число " + num2 + " равны");
		} else if (num1 < num2) {
			System.out.println("Число " + num1 +" минимальное, а число " + num2 + " максимальное");
		} else {
			System.out.println("Число " + num1 +" максимальное, а число " + num2 + " минимальное");
		}

		System.out.println("\n3.Работа с числом\n");
		int randomNum = -100 + (int) (Math.random() * 100);
		System.out.println("Исходное число: " + randomNum);
		if(randomNum == 0) {
			System.out.println("число " + randomNum + " равно нулю");
		} else {
			if((randomNum % 2) == 0){
				System.out.println(randomNum + " это число четное ");
			} else {
				System.out.println(randomNum + " это число нечетное");
			} 
			if(randomNum < 0) {
				System.out.println("и отрицательное");
			} else {
				System.out.println("и положительное");
			}
		}

		System.out.println("\n4.Поиск одинаковых цифр в числах\n");
		num1 = 432;
		num2 = 431;
		int hundreds1 = num1 / 100;
		int dozens1 = (num1 % 100) / 10;
		int ones1 = num1 % 10;
		int hundreds2 = num2 / 100;
		int dozens2 = (num2 % 100) / 10;
		int ones2 = num2 % 10;
		System.out.println("Исходное числа: " + num1 + ", " + num2);
		if(hundreds1 == hundreds2) {
			System.out.println("Одинаковые цифры: " + hundreds1 + "\nРазряд: третий ");
		}
		if(dozens1 == dozens2) {
			System.out.println("Одинаковые цифры: " + dozens1 + "\nРазряд: второй ");
		}
		if(ones1 == ones2) {
			System.out.println("Одинаковые цифры: " + ones1 + "\nРазряд: первый ");
		}
		if(!(hundreds1 == hundreds2) && !(dozens1 == dozens2) && !(ones1 == ones2)) {
			System.out.println("Все цифры разные");
		}

		System.out.println("\n5.Определение буквы, числа или символа по их коду\n");
		char uncknownChar = '\u0057';
		System.out.println("Символ " + uncknownChar + " это:");
		if((uncknownChar >= 'a') && (uncknownChar <= 'z')) {
			System.out.println("маленькая буква");
		} else if((uncknownChar >=  'A') && (uncknownChar <= 'Z')) {
			System.out.println("большая буква");
		} else if((uncknownChar >=  '0') && (uncknownChar <= '9')) {
			System.out.println("число");
		} else {
			System.out.println("не буква и не число");
		}

		System.out.println("\n6.Определение суммы вклада и начисленных банком %\n");
		double depositAmount = 300000;
		double percent = 0;
		System.out.println("Сумма вклада: " + depositAmount);
		if(depositAmount < 100000) {
			percent = 0.05;
		} else if((100000 <= depositAmount) && (depositAmount <= 300000)) {
			percent = 0.07;
		} else {
			percent = 0.1;
		}
		depositAmount += (depositAmount * percent);
		System.out.println("Начислено " +((int) (percent * 100)) + "%  \nИтоговая сумма с % равна " + depositAmount);

		System.out.println("\n7.Определение оценки по предметам\n");
		double historyGrade = 0.59;
		double programGrade = 0.91;
		double avrgPrecent = (historyGrade + programGrade) / 2 * 100;
		int grade1;
		int grade2;
		int avrgGrade;
		if(historyGrade <= 0.6) {
			System.out.println((grade1 = 2) + " - История");
		} else if((0.6 < historyGrade) && (historyGrade < 0.73)) {
			System.out.println((grade1 = 3) + " - История");
		} else if((0.73 < historyGrade) && (historyGrade < 0.91)) {
			System.out.println((grade1 = 4) + " - История");
		} else {
			System.out.println((grade1 = 5) + " - История");
		}
		if(programGrade <= 0.6) {
			System.out.println((grade2 = 2) + " - Программирование");
		} else if((0.6 < programGrade) && (programGrade < 0.73)) {
			System.out.println((grade2 = 3) + " - Программирование");
		} else if((0.73 < programGrade) && (programGrade < 0.91)) {
			System.out.println((grade2 = 4) + " - Программирование");
		} else {
			System.out.println((grade2 = 5) + " - Программирование");
		}
		System.out.println(" средний балл: " + (avrgGrade = (grade1 + grade2) / 2) +
				"\n средний % по предметам: "+ avrgPrecent + "%");

		System.out.println("\n8.Расчет прибыли\n");
		double premisesCost = 5000;
		double goodsCost = 9000;
		double goodsSold = 13000;
		double yearsProfit = 12 * (goodsSold - (premisesCost + goodsCost));
		if(yearsProfit > 0) {
			System.out.println("Прибыль за год: +" + yearsProfit);
		} else {
			System.out.println("Прибыль за год: " + yearsProfit);
		}

		System.out.println("\n9.Подсчет количества банкнот\n");
		double usd1 = 567;
		int amountBanknotes10 = 5;
		int banknotes100 = (int) usd1 / 100;
		int banknotes1 = (int) usd1 % 10;
		int banknotes10 = ((int) usd1 % 100) / 10;
		if(amountBanknotes10 < banknotes10) {
			banknotes1 +=(banknotes10 * 10) - (amountBanknotes10 * 10);
			banknotes10 = amountBanknotes10;
		}
		double usd2 = (banknotes100 * 100) + (banknotes10 * 10) + banknotes1;
		if(usd1 == usd2) {
			System.out.println("Банкнот номиналом 100$ требуется: " + banknotes100 +
					"\nБанкнот номиналом 10$ требуется: " + banknotes10 +
					"\nБанкнот номиналом 1$ требуется: " + banknotes1 +
					"\nпосчитанная исходная сумма = " + usd2);
		}
	}
}