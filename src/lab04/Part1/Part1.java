package lab04.Part1;

import java.util.Arrays;
import java.util.Scanner;

public class Part1 {

    // Задание № 1
    public static void oddNumbers() {

        for (int a = 1; a <= 99; a += 2) {
            System.out.println(a);
        }
    }

    // Задание № 2
    public static void dividedByThreeFive() {

        System.out.print("\nДелится на 3: ");
        for (int b = 1; b <= 100; b++) {
            if (b % 3 == 0) {
                System.out.print(b + ", ");
            }
        }

        System.out.print("\nДелится на 5: ");
        for (int b = 1; b <= 100; b++) {
            if (b % 5 == 0) {
                System.out.print(b + ", ");
            }
        }

        System.out.print("\nДелится на 3 и на 5: ");
        for (int b = 1; b <= 100; b++) {
            if (b % 3 == 0 && b % 5 == 0) {
                System.out.print(b + ", ");
            }
        }
        System.out.println();
    }

    // Задание № 3
    public static void sumOfTwoIntegers() {

        Scanner scannerEx3 = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int number01 = scannerEx3.nextInt();
        System.out.println(number01);

        System.out.println("Введите второе целое число:");
        int number02 = scannerEx3.nextInt();
        System.out.println(number02);

        System.out.println("Введите третье целое число:");
        int number03 = scannerEx3.nextInt();
        System.out.println(number03);

        scannerEx3.close();

        int sum = number01 + number02 + number03;

        if (sum == number03) {
            System.out.println("Сумма двух первых чисел равна третьему: true");
        }
    }

    // Задание № 4
    public static void comparisonOfThreeIntegers() {

        Scanner scannerEx4 = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int number1 = scannerEx4.nextInt();
        System.out.println(number1);

        System.out.println("Введите второе целое число:");
        int number2 = scannerEx4.nextInt();
        System.out.println(number2);

        System.out.println("Введите третье целое число:");
        int number3 = scannerEx4.nextInt();
        System.out.println(number3);

        scannerEx4.close();

        if (number2 > number1 && number3 > number2) {
            System.out.println("Второе число больше первого и меньше третьего: true");
        }
    }

    // Задание № 5
    public static void threeFirstLast(int[] arrayEx5) {


        if (arrayEx5[0] == 3 && arrayEx5[arrayEx5.length - 1] == 3 && arrayEx5.length >= 2) {
            System.out.println("true");
        }
    }

    // Задание № 6
    public static boolean oneThreeConsistsOf(int[] arrayEx6) {

        boolean isConsistsOf = false;

        for (int i = 0; i < arrayEx6.length; i++) {
            if (arrayEx6[i] == 1 || arrayEx6[i] == 3) {
                isConsistsOf = true;
                break;
            }
        }
        return isConsistsOf;
    }
}
