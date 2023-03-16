package lab04.Part1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        System.out.println("==================  Задание 1  ==================");
        Part1.oddNumbers();

        System.out.println("==================  Задание 2  ==================");
        Part1.dividedByThreeFive();

        System.out.println("==================  Задание 3  ==================");
        Part1.sumOfTwoIntegers();

        System.out.println("==================  Задание 4  ==================");
        Part1.comparisonOfThreeIntegers();

        System.out.println("==================  Задание 5  ==================");
        Part1.threeFirstLast(new int[]{3, -3, 7, 4, 5, 4, 3});

        System.out.println("==================  Задание 6  ==================");
        int[] arrayEx6 = {3, -3, 7, 4, 5, 4, 3};
        System.out.println("Массив " + Arrays.toString(arrayEx6) + " содержит число 1 или 3: " + Part1.oneThreeConsistsOf(arrayEx6));


    }
}
