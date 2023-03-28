package lab10;

import java.io.*;
import java.util.*;

public class Lab10 {

    // Задание № 1: метод, который читает текстовый файл и возвращает его в виде списка строк

    public static List<String> fileToListOfStrings(String pathNameEx1) {

        File fileEx1 = new File(pathNameEx1);
        List listOfStrings = new ArrayList<String>();

        try (BufferedReader bufferedReaderEx1 = new BufferedReader(new FileReader(fileEx1))) {
            String input = null;
            while ((input = bufferedReaderEx1.readLine()) != null) {
                listOfStrings.add(input + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        return listOfStrings;
    }

    // Задание № 2: метод, который записывает в файл строку, переданную параметром
    public static void writeStringToFile(String stringEx2, String pathNameEx2) {

        File fileEx2 = new File(pathNameEx2);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileEx2, true))) {
            writer.append(stringEx2 + "\n");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    // Задание № 3: метод, который записывает в файл строку, переданную параметром
    public static void mergeFiles(String pathNameFirstFile, String pathNameSecondFile) {

        File firstFile = new File(pathNameFirstFile);
        File secondFile = new File(pathNameSecondFile);

        try (BufferedReader bufferedReaderSecondFile = new BufferedReader(new FileReader(secondFile));
             BufferedWriter bufferedWriterFirstFile = new BufferedWriter(new FileWriter(firstFile, true))) {
            String inputString = null;
            while ((inputString = bufferedReaderSecondFile.readLine()) != null) {
                bufferedWriterFirstFile.append(inputString + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    // Задание № 4: метод, который заменяет в файле все кроме букв и цифр на знак "$"
    public static void replaceInFile(String pathNameFileEx4) {

        File fileEx4 = new File(pathNameFileEx4);
        List<String> stringListEx4 = fileToListOfStrings(pathNameFileEx4);

        try (BufferedWriter bufferedWriterEx4 = new BufferedWriter(new FileWriter(fileEx4, false))) {
            for (String string : stringListEx4) {
                bufferedWriterEx4.append(string.replaceAll("[^a-zA-Zа-яёА-ЯЁ0-9]", "\\$") + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
