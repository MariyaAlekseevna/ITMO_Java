package lab06.Exercise5;

import java.util.Scanner;

public class Parent {
    private int userAge;
    public Scanner scanner = new Scanner(System.in);

    public void setData() {
        System.out.println("Введите возраст пользователя: ");
        userAge = scanner.nextInt();
    }

    public int getUserAge() {
        return userAge;
    }
}
