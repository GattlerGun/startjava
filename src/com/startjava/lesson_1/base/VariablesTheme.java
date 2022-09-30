package com.startjava.lesson_1.base;

public class VariablesTheme {

	public static void main(String[] args) {
		System.out.println("1.Создание переменных и вывод их значений на консоль\n");
		int amountCpu = 4;
		short ram = 6;
		byte typeSys = 64;
		long amountMonitor = 1;
		float maxGhz = 2.93f; 
		double minGhz = 2.92;
		String namePC = "PC1";
		char ch = 'А';
		boolean itsPC = true;
		System.out.println("Количество оперативной памяти = " + ram);
		System.out.println("Тип системы х" + typeSys);
		System.out.println("Количество ядер = " + amountCpu);
		System.out.println("Максимальное количество GHz процессора = " + maxGhz);
		System.out.println("Минимальное количество GHz процессора = " + minGhz);
		System.out.println("Количество мониторов = " + amountMonitor);
		System.out.println("Имя пк = " + namePC);
		System.out.println("Символ " + ch);
		System.out.println("Это компьютер? " + itsPC);

		System.out.println("\n2.Расчет стоимости товара со скидкой \n");
		double penPrice = 100;
		double bookPrice = 200;
		double discount = 0.11;
		double sum = penPrice + bookPrice;
		double discountPrice = sum - (sum * discount);
		System.out.println("Стоимость ручки и книги вместе: " + sum);
		System.out.println("Стоимость с учетом скидки: " + discountPrice);

		System.out.println("\n3.Вывод на консоль слова JAVA\n");
		System.out.println("   J    a  v     v  a");
		System.out.println("   J   a a  v   v  a a");
		System.out.println("J  J  aaaaa  V V  aaaaa");
		System.out.println(" JJ  a     a  V  a     a");

		System.out.println("\n4.Отображение min и max значений числовых типов данных\n");
		byte byteMax = 127;
		short shortMax = 32767;
		int intMax = 2147483647;
		long longMax = 9223372036854775807L;
		System.out.println("первоначальное значение   = " + byteMax);
		System.out.println("значение после инкремента = " + (++byteMax));
		System.out.println("значение после декремента = " + (--byteMax));
		System.out.println("\nпервоначальное значение   = " + shortMax);
		System.out.println("значение после инкремента = " + (++shortMax));
		System.out.println("значение после декремента = " + (--shortMax));
		System.out.println("\nпервоначальное значение   = " + intMax);
		System.out.println("значение после инкремента = " + (++intMax));
		System.out.println("значение после декремента = " + (--intMax));
		System.out.println("\nпервоначальное значение   = " + longMax);
		System.out.println("значение после инкремента = " + (++longMax));
		System.out.println("значение после декремента = " + (--longMax));

		System.out.println("\n5.Перестановка значений переменных\n");
		int x = 2;
		int y = 5;
		System.out.println("\ni.Перестановка с помощью третьей переменной");
		System.out.println("Исходное значение x = " + x);
		System.out.println("Исходное значение y = " + y);
		int	z = x;
		x = y;
		y = z;
		System.out.println("Переставленное значение x = " + x);
		System.out.println("Переставленное значение y = " + y);
		System.out.println("\nii.с помощью арифметических операций");
		System.out.println("Исходное значение x = " + x);
		System.out.println("Исходное значение y = " + y);
		x += y;
		y = x - y;
		x -= y;
		System.out.println("Переставленное значение x = " + x);
		System.out.println("Переставленное значение y = " + y);
		System.out.println("\niii.с помощью побитовой операции ^");
		System.out.println("Исходное значение x = " + x);
		System.out.println("Исходное значение y = " + y);
		x ^= y;
		y ^= x;
		x ^= y;
		System.out.println("Переставленное значение x = " + x);
		System.out.println("Переставленное значение y = " + y);

		System.out.println("\n6.Вывод символов и их кодов\n");
		int ch1 = '#';
		int ch2 = '&';
		int ch3 = '@';
		int ch4 = '^';
		int ch5 = '_';
		System.out.println(ch1 + " = " + (char) ch1);
		System.out.println(ch2 + " = " + (char) ch2);
		System.out.println(ch3 + " = " + (char) ch3);
		System.out.println(ch4 + " = " + (char) ch4);
		System.out.println(ch5 + " = " + (char) ch5);

		System.out.println("\n7.Отображение количества сотен, десятков и единиц числа\n");
		int srcNum = 123;
		int hundreds = srcNum / 100;
		int dozens = (srcNum % 100) / 10;
		int ones = srcNum % 10;
		System.out.println("Число " + srcNum + "содержит:");
		System.out.println(hundreds + " сотню(-ен)");
		System.out.println(dozens + " десяток(-ов)");
		System.out.println(ones + " единиц(-ы)");

		System.out.println("\n8.Вывод на консоль ASCII-арт Дюка\n");
		char slash = '/'; 
		char backSlash = '\\';
		char underscore = '_';
		char opParenthesis = '(';
		char clParenthesis = ')';
		char space = ' ';
		System.out.println("" + space + space + space +space + slash + backSlash);
		System.out.println("" + space + space + space + slash + space + space + backSlash );
		System.out.println("" + space + space + slash + underscore + opParenthesis + space + clParenthesis + backSlash);
		System.out.println("" + space + slash + space + space + space + space + space + space + backSlash);
		System.out.println("" + slash + underscore + underscore + underscore + underscore +
				slash + backSlash + underscore + underscore + backSlash);

		System.out.println("\n9.Произведение и сумма цифр числа\n");
		srcNum = 345;
		hundreds = srcNum / 100;
		dozens = (srcNum % 100) / 10;
		ones = srcNum % 10;
		System.out.println("сумма цифр числа " + srcNum + " = " + (hundreds + dozens + ones));
		System.out.println("произведение цифр числа " + srcNum + " = " + (hundreds * dozens * ones));

		System.out.println("\n10.Преобразование секунд\n");
		int amountSec = 86399;
		int hours = amountSec / 3600;
		int minuts = (amountSec % 3600) / 60;
		int seconds = amountSec % 60;
		System.out.println(hours + ":" + minuts + ":" + seconds);
	}
}