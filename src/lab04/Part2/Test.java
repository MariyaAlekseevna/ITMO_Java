package lab04.Part2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        System.out.println("==================  Задание 1  ==================");
        Part2.exercise1(new int[]{1, 3, 10, 30, 25, 33});

        System.out.println("==================  Задание 2  ==================");
        System.out.println("Result: " + Arrays.toString(Part2.exercise2()));

        System.out.println("==================  Задание 3  ==================");
        Part2.exercise3(new int[]{1, 3, 10, 30, 25, 33});

        System.out.println("==================  Задание 4  ==================");
        Part2.exercise4(new int[]{1, 1, 25, 3, 25, 1, 25});
    }
}
