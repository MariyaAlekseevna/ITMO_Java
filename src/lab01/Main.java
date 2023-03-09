package lab01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercise 01
        System.out.println("_______Exercise 01_______");
        System.out.println("Я");
        System.out.println("знаю");
        System.out.println("хорошо");
        System.out.println("Java");

        // Exercise 02
        System.out.println("_______Exercise 02_______");
        double res1 = (46 + 18) * (10 / 3.0);
        System.out.println("Результат первого выражения (46 + 18) * (10 / 3.0) = " + res1);

        int res2 = 29 * 4 * -15;
        System.out.println("Результат второго выражения 29 * 4 * -15 = " + res2);

        // Exercise 03
        System.out.println("_______Exercise 03_______");
        int number = 10500;
        double result = (number / 10.0) / 10;
        System.out.println("Результат выражения (10500 / 10.0) / 10 = " + result);

        // Exercise 04
        System.out.println("_______Exercise 04_______");
        double result04 = 3.6 * 4.1 * 5.9;
        System.out.println("Результат выражения 3.6 * 4.1 * 5.9 = " + result04);

        // Exercise 05
        System.out.println("_______Exercise 05_______");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int num2 = scanner.nextInt();
        System.out.println("Введите третье число");
        int num3 = scanner.nextInt();
        scanner.close();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        // Exercise 06
        System.out.println("_______Exercise 06_______");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число");
        int b = scan.nextInt();
        //scan.close();
        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b <= 100) {
            System.out.println("Четное");
        } else {
            System.out.println("Выход за пределы диапазона");
        }
    }
}
