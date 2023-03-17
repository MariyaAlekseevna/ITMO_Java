package lab06.Exercise4;

import java.util.Scanner;

public class Parent {
    private int number;

    public void setNumber() {

        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
    }

    public int getNumber() {
        return number;
    }
}
