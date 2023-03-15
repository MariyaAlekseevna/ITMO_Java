package lab04.Part2;

import java.util.Arrays;
import java.util.Scanner;

public class Part2 {
    public static void Exercise1() {

        int[] arrayEx1 = {1, 3, 10, 20, 25, 33};
        boolean resultEx1 = true;

        for (int i = 0; i < arrayEx1.length - 1; i++) {
            if (arrayEx1[i] > arrayEx1[i + 1]) {
                System.out.println("Please, try again");
                return;
            }
        }
        System.out.println("OK");
    }

    public static int[] Exercise2() {

        Scanner scannerEx2 = new Scanner(System.in);

        System.out.println("Array length: ");
        int arrayEx2Length = scannerEx2.nextInt();
        int[] arrayEx2 = new int[arrayEx2Length];

        System.out.println("Numbers of array: ");
        for (int i = 0; i < arrayEx2Length; i++) {
            arrayEx2[i] = scannerEx2.nextInt();
        }
        return arrayEx2;
    }

    public static void Exercise3() {
        int[] arrayEx3 = {1, 3, 10, 20, 25, 33};
        int arrayEx3Length = arrayEx3.length;

        System.out.println("Array 1: " + Arrays.toString(arrayEx3));

        int elemet1 = arrayEx3[0];
        arrayEx3[0] = arrayEx3[arrayEx3.length - 1];
        arrayEx3[arrayEx3.length - 1] = elemet1;

        System.out.println("Array 2: " + Arrays.toString(arrayEx3));
    }

    public static void Exercise4() {

        int[] arrayEx4 = {1, 1, 25, 3, 25, 1, 25};
        System.out.println("Массив: " + Arrays.toString(arrayEx4));

        for (int i = 0; i < arrayEx4.length; i++) {
            int counter = 0;

            for (int j = 0; j < arrayEx4.length; j++) {
                if (arrayEx4[i] == arrayEx4[j]) {
                    counter++;
                }
            }
            if (counter == 1) {
                System.out.println("Первое уникальное значение в массиве: " + arrayEx4[i]);
                return;
            }
        }
        System.out.println("В массиве нет уникальных элементов.");
        return;
    }
}

