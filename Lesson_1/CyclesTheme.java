public class CyclesTheme {

	public static void main(String[] args) {
		System.out.println("1.Подсчет суммы четных и нечетных чисел\n");
		int x = 0;
		int y = 0;
		int i = -10;
		do {
			if((i % 2) == 0) {
				x += i;
			} else {
				y += i;
			}
			i++;
		} while(i <= 21);
		System.out.println("В промежутке [-10, 21] сумма четных чисел = " + x +
				", а нечетных = " + y);

		System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания\n");
		int value1 = 10;
		int value2 = 5;
		int value3 = -1;
		int maxValue = 0;
		int minValue = 0;
		if((value1 > value2) && (value1 > value3)) {
			System.out.println("Максимальное значение: " + (maxValue = value1));
		} else if ((value1 < value2) && (value2 > value3)) {
			System.out.println("Максимальное значение: " + (maxValue = value2));
		} else {
			System.out.println("Максимальное значение: " + (maxValue = value3));
		}
		if((value1 < value2) && (value1 < value3)) {
			System.out.println("Минимальное значение: " + (minValue = value1));
		} else if((value2 < value1) && (value2 < value3)) {
			System.out.println("Минимальное значение: " + (minValue = value2));
		} else {
			System.out.println("Минимальное значение: " + (minValue = value3));
		}
		System.out.print("Все числа в промежутке [" + maxValue + ", " + minValue + "]: ");
		for(i = maxValue; i >= minValue; i--) {
			System.out.print(i + " ");
		}

		System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр\n");
		int num = 1234;
		int reverseNum;
		int sum = 0;
		System.out.print("Исходное число в обратном порядке: ");
		while(num > 0) {
			reverseNum = num % 10;
			sum += num % 10;
			num = (num - reverseNum) / 10;
			System.out.print(reverseNum);
		}
		System.out.println("\nСумма его цифр = " + sum);

		System.out.println("\n4.Вывод чисел на консоль в несколько строк\n");
		for(i = 1; i < 25;) {
			for(int j = 0; j < 5; j++) {
				if(i < 25) {
					System.out.printf("%4d", i);
					i += 2;
				} else {
					System.out.printf("%4d", 0);
				}
			}
		System.out.println();
		}

		System.out.println("\n5.Проверка количества единиц на четность\n");
		num = 3141591;
		i = num;
		int ones = 0;
		int amountOnes = 0;
		while(i > 0) {
			ones = i;
			ones %= 10;
			i /= 10;
			if(ones == 1) {
				amountOnes += ones;
			}
		}
		if(amountOnes % 2 == 0) {
			System.out.println("Число " + num + " содержит четное количество единиц " + amountOnes);
		} else {
			System.out.println("Число " + num + " содержит нечетное количество единиц " + amountOnes);
		}

		System.out.println("\n6.Отображение фигур в консоли\n");
		int j = 0;
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		i = 0;
		int countCycle = 5;
		while(i < 5) {
			j = countCycle;
			while(j > 0) {
				System.out.print("#");
				j--;
			}
			System.out.println();
			i++;
			countCycle--; 
		}
		i = 1;
		do {
			j = 1;
			do {
				System.out.print("$");
				j++;
				if(j >= 4) {
					break;
				}
			} while((j <= i) && (i <= 3));
			System.out.println();
			i++;
		} while(i < 4);
		j = 3;
		do {
			do {
				System.out.print("$");
				j--;
			} while(j > 1);
			System.out.println();
			i++;
		} while (i <= 5);

		System.out.println("\n7.Отображение ASCII-символов\n");
		int dec;
		char ch;
		System.out.printf("%5s%15s%n", "Dec", "Char");
		System.out.println("---------------------------");
		for(i = '\u0000'; i <= '/'; i++) {
			if((i % 2) != 0) {
				dec = i;
				ch = (char) dec;
				System.out.printf("%5d%15c%n", dec, ch);
			}
		}
		System.out.println("---------------------------");
		for(j = 'a'; j <= 'z'; j++) {
			if((j % 2) == 0) {
				dec = j;
				ch = (char) dec;
				System.out.printf("%5d%15c%n", dec, ch);
			}
		}

		System.out.println("\n8.Проверка, является ли число палиндромом\n");
		num = 1234321;
		reverseNum = 0;
		int digit = 0;
		while(num > 0) {
			digit = num % 10;
			num = (num - digit) / 10;
			reverseNum = (reverseNum + digit) * 10; 
		}
		num = 1234321;
		reverseNum /= 10;
		if(reverseNum == num) {
			System.out.println("число " + reverseNum + " является палиндромом");
		} else {
			System.out.println("число " + num + " не является палиндромом");
		}

		System.out.println("\n9.Определение, является ли число счастливым\n");
		num = 325145;
		digit = 0;
		int sum1 = 0;
		int sum2 = 0;
		for(i = 0; i < 6; i++) {
			if(i < 3) {
				sum2 += num % 10;
				num = num / 10;
			} else {
				sum1 += num % 10; 
				num = num / 10;
			}
		}
		num = 325145;
		int abc = num / 1000;
		num %= 1000; 
		System.out.printf("Сумма цифр %d = %d%n", abc, sum1);
		System.out.printf("Сумма цифр %d = %d%n", num, sum2);
		if(sum1 == sum2) {
			System.out.println("Число является счастливым");
		} else {
			System.out.println("Число не является счастливым");
		}

		System.out.println("\n10.Вывод таблицы умножения Пифагора\n");
		int result = 0;
		System.out.printf("%28S%n","таблицы Пифагора");
		System.out.printf("%3s%4d%4d%4d%4d%4d%4d%4d%4d%n", "|", 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("__|__________________________________");
		for(i = 2; i < 10; i++) {
			System.out.printf("%1d%2s", i, "|");
			for(j = 2; j < 10; j++) {
				result = j * i;
				System.out.printf("%4d", result);
			}
			System.out.println();
		}
	}
}