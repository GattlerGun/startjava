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
			System.out.println(randomNum + " равно нулю");
		} else if(randomNum < 0) {
			System.out.println(randomNum + " это число отрицательное");
		} else {
			System.out.println(randomNum + " это число положительное");
		}

		System.out.println("\n4.Поиск одинаковых цифр в числах\n");
		num1 = 432;
		num2 = 431;
		int hundreds1 = num1 / 100;
		int dozens1 = (num1 % 100) / 10;
		int units1 = num1 % 10;
		int hundreds2 = num2 / 100;
		int dozens2 = (num2 % 100) / 10;
		int units2 = num2 % 10;
		System.out.println("Исходное числа: " + num1 + ", " + num2);
		if((hundreds1 == hundreds2) && (dozens1 == dozens2) && (units1 == units2)) {
			System.out.println("Все цифры и разряды равны");
		} else if((hundreds1 == hundreds2) && (dozens1 == dozens2) && !(units1 == units2)) {
			System.out.println("Одинаковые цифры: " + hundreds1 + " и " + dozens1 +
					"\nРазряд: второй " + dozens1 + " и третий " + hundreds1);
		} else if((hundreds1 == hundreds2) && !(dozens1 == dozens2) && (units1 == units2)) {
			System.out.println("Одинаковые цифры: " + hundreds1 + " и " + units1 +
					"\nРазряд: первый " + units1 + " и третий " + hundreds1);
		} else if(!(hundreds1 == hundreds2) && (dozens1 == dozens2) && (units1 == units2)) {
			System.out.println("Одинаковые цифры: " + hundreds1 + " и " + dozens1 +
					"\nРазряд: первый " + units1 + " и второй " + dozens1);
		} else if(!(hundreds1 == hundreds2) && !(dozens1 == dozens2) && (units1 == units2)) {
			System.out.println("Одинаковые цифры: " + units1 + " Разряд: первый " + units1);
		} else if(!(hundreds1 == hundreds2) && (dozens1 == dozens2) && !(units1 == units2)) {
			System.out.println("Одинаковые цифры: " + dozens1 + " Разряд: первый " + dozens1);
		} else if((hundreds1 == hundreds2) && !(dozens1 == dozens2) && !(units1 == units2)) {
			System.out.println("Одинаковые цифры: " + hundreds1 + " Разряд: первый " + hundreds1);
		} else {
			System.out.println("Все цифры разные");
		}

		System.out.println("\n5.Определение буквы, числа или символа по их коду\n");
		char ch1 = '\u0057';
		System.out.println("Символ " + ch1 + " это:");
		if(('\u0060' < ch1) && (ch1 < '\u007B')) {
			System.out.println("маленькая буква");
		} else if(('\u0040' < ch1) && (ch1 < '\u005B')) {
			System.out.println("большая буква");
		} else if(('\u002F' < ch1) && (ch1 < '\u003A')) {
			System.out.println("число");
		} else {
			System.out.println("не буква и не число");
		}

		System.out.println("\n6.Определение суммы вклада и начисленных банком %\n");
		double depositAmount = 300000;
		System.out.println("Сумма вклада: " + depositAmount);
		if(depositAmount < 100000) {
			depositAmount = depositAmount + (depositAmount * 0.05);
			System.out.println("Начислено 5% \nИтоговая сумма с % равна " + depositAmount);
		} else if((100000 <= depositAmount) && (depositAmount <= 300000)) {
			depositAmount = depositAmount + (depositAmount * 0.07);
			System.out.println("Начислено 7% \nИтоговая сумма с % равна " + depositAmount);
		} else {
			depositAmount = depositAmount + (depositAmount * 0.1);
			System.out.println("Начислено 10% \nИтоговая сумма с % равна " + depositAmount);
		}

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
		double yearsProfit = (goodsSold - (premisesCost + goodsCost)) * 12;
		if(yearsProfit < 0) {
			System.out.println("Прибыль за год: " + yearsProfit);
		} else {
			System.out.println("Прибыль за год: +" + yearsProfit);
		}

		System.out.println("\n9.Подсчет количества банкнот\n");
		double usd1 = 567;
		int banknts100 = (int) usd1 / 100;
		int banknts10 = 5;
		int banknts1 = ((int) usd1 % 100) - (banknts10 * 10);
		double usd2 = (banknts100 * 100) + (banknts10 * 10) + banknts1;
		if(usd1 == usd2) {
			System.out.println("Банкнот номиналом 100$ требуется: " + banknts100 +
					"\nБанкнот номиналом 10$ требуется: " + banknts10 +
					"\nБанкнот номиналом 1$ требуется: " + banknts1 +
					"\nпосчитанная исходная сумма = " + usd2);
		}
	}
}