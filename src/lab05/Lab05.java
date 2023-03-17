package lab05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab05 {

    // Задание № 1: метод для поиска самого длинного слова в тексте
    public static String maxWordLength(String stringEx1) {

        String[] words = stringEx1.split(" ");
        int maxLength = 0;
        String maxWord = "";
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                maxWord = word;
            }
        }
        return maxWord;
    }

    // Задание № 2: метод, который проверяет является ли слово палиндромом
    public static boolean palindrom(String wordEx2) {

        String wordEx2Reverse = new StringBuilder(wordEx2).reverse().toString();
        return wordEx2.equalsIgnoreCase(wordEx2Reverse);
    }

    // Задание № 3: метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]»
    public static String changeWord(String textEx3, String oldExpression, String newExpression) {

        int index = textEx3.indexOf(oldExpression);
        if (index >= 0) {
            textEx3 = textEx3.replaceAll(oldExpression, newExpression);
        }
        return textEx3;
    }

    // Задание № 4: количество вхождений подстроки в строку
    public static int matchNumber(String stringEx4, String subStringEx4) {

        Pattern pattern = Pattern.compile(subStringEx4);
        Matcher matcher = pattern.matcher(stringEx4);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    // Задание № 5: метод, который инвертирует слова в строке
    public static void inversion(String string) {

        System.out.println("The given string is: " + string);
        String[] stringArray = string.split(" ");
        StringBuilder stringReverse = new StringBuilder();
        for (String word : stringArray) {
            stringReverse.append(new StringBuilder(word).reverse())
                    .append(" ");
        }
        System.out.println("The string reversed word by word is: " + stringReverse);
    }
}
