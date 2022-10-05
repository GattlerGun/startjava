package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1.Реверс значений массива\n");
        int[] intArr1 = {2, 5, 3, 1, 4, 7, 6};
        System.out.print("Заданный массив: ");
        printIntArr(intArr1);
        int length = intArr1.length;
        for(int i = 0; i < length; i++) {
            int tmp = intArr1[i];
            --length;
            intArr1[i] = intArr1[length];
            intArr1[length] = tmp;
        }
        System.out.print("\nМассив после реверса: ");
        printIntArr(intArr1);

        System.out.println("\n\n2.Вывод произведения элементов массива\n");
        int[] intArr2 = new int[10];
        length = intArr2.length;
        for(int i = 0; i < length; i++) {
            intArr2[i] = i;
        }
        int result = 1;
        for(int i = 1; i < length - 1; i++) {
            result *= intArr2[i];
            System.out.print(intArr2[i] + ((i < length - 2) ? " * " : " = " + result));
        }
        System.out.println("\nЦифра под индексом 0: " + intArr2[0] + ", Цифра под индексом 9: " + intArr2[9]);

        System.out.println("\n3.Удаление элементов массива\n");
        double[] doubleArr = new double[15];
        length = doubleArr.length;
        for(int i = 0; i < length; i++) {
            doubleArr[i] = Math.random();
        }
        double avrgNum = doubleArr[length / 2];
        System.out.println("Исходный массив:");
        for(int i = 0; i < length; i++) {
            System.out.printf("%7.3f", doubleArr[i]);
            if(i == length/2) {
                System.out.println();
            }

        }
        for(int i = 0; i < length; i++) {
            if(doubleArr[i] < avrgNum) {
                doubleArr[i] = 0.0;
            }
        }
        int zeroAmount = 0;
        System.out.println("\nИзменненый массив:");
        for(int i = 0; i < length; i++) {
            System.out.printf("%7.3f", doubleArr[i]);
            if(i == length/2) {
                System.out.println();
            }
            if(doubleArr[i] == 0) {
                zeroAmount++;
            }
        }
        System.out.println("\nКоличество обнуленных ячеек: " + zeroAmount);

        System.out.println("\n4.Вывод элементов массива лесенкой в обратном порядке\n");
        char[] charArr = new char[26];
        int decLetter = 65;
        length = charArr.length;
        for(int i = 0; i < length; i++) {
            charArr[i] = (char)(decLetter + i);
        }
        for(int i = 0; i < length / 2; i++) {
            char ch = charArr[i];
            charArr[i] = charArr[length - 1 - i];
            charArr[length - 1 - i] = ch;
        }
        int charCount = 0;
        int numChar = 0;
        while(charCount < charArr.length) {
            int j = 0;
            while(j <= numChar) {
                System.out.print(charArr[j]);
                j++;
            }
            System.out.println();
            charCount++;
            numChar++;
        }

        System.out.println("\n5.Генерация уникальных чисел\n");
        int[] intArr3 = new int[30];
        boolean alreadyThere;
        Random rand = new Random();
        length = intArr3.length;
        for(int i = 0; i < length;) {
            alreadyThere = false;
            int randomNumber = 60 + rand.nextInt(40);
            for(int j = 0; j < i; j++) {
                if (intArr3[j] == randomNumber) {
                    alreadyThere = true;
                    break;
                }
            }
            if(!alreadyThere) {
                intArr3[i] = randomNumber;
                i++;
            }
        }
        boolean sorted = false;
        while(!sorted) {
            int temp;
            sorted = true;
            for(int i = 0; i < length - 1; i++) {
                if(intArr3[i] > intArr3[i + 1]) {
                    temp = intArr3[i];
                    intArr3[i] = intArr3[i + 1];
                    intArr3[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        int count = 10;
        for(int i = 0; i < length; i++) {
            if(i < count) {
                System.out.printf("%4d", intArr3[i]);
            } else {
                System.out.println();
                count += 10;
                i--;
            }
        }

        System.out.println("\n\n6.Сдвиг элементов массива\n");
        String[] inputStringArr = {" ", "AA", "", "BBB", "CC",
                "D", " ", "E", "FF", "G", ""};
        length = 0;
        for(String letter : inputStringArr) {
            if(!letter.isBlank()) {
                length++;
            }
        }
        String[] outStringArr = new String[length];
        int indexStart = 0;
        int indexLength = 0;
        for(int i = 0; i < inputStringArr.length; i++) {
            if(inputStringArr[i].isBlank()) {
                int firstNull = 0;
                for(int j = 0; j < outStringArr.length; j++) {
                    if(outStringArr[j] == null) {
                        firstNull = j;
                        break;
                    }
                }
                System.arraycopy(inputStringArr, indexStart, outStringArr,
                        firstNull, indexLength);
                indexStart = 0;
                indexLength = 0;
            } else {
                if(indexStart == 0) {
                    indexStart = i;
                }
                indexLength++;
            }
        }
        System.out.print("Изначальный массив: ");
        printStringArr(inputStringArr);
        System.out.print("\nМассив без пробелов: " );
        printStringArr(outStringArr);
    }

    public static void printIntArr(int[] array) {
        for(int a : array) {
            System.out.print(a + " ");
        }
    }

    public  static  void printStringArr(String[] array) {
        for(String a : array) {
            System.out.print(a + "|");
        }
    }
}
