package lab05;

import lab04.Part2.Part2;

public class Test {
    public static void main(String[] args) {

        System.out.println("==================  Задание 1  ==================");
        String stringEx1 = new String("Написать метод для поиска самого длинного слова в тексте");
        System.out.println(Lab05.maxWordLength(stringEx1));

        System.out.println("==================  Задание 2 ==================");
        String wordEx2 = "Мадам";
        System.out.println("Слово \"" + wordEx2 + "\" является палиндромом: " + Lab05.palindrom(wordEx2));

        System.out.println("==================  Задание 3 ==================");
        String textEx3 = "бяка - что-нибудь плохое, дурное";
        String oldExpression = "бяка";
        String newExpression = "[вырезано цензурой]";
        System.out.println(Lab05.changeWord(textEx3, oldExpression, newExpression));

        System.out.println("==================  Задание 4 ==================");
        String stringEx4 = "мама мыла раму";
        String substringEX4 = "ма";
        System.out.println(Lab05.matchNumber(stringEx4, substringEX4));

        System.out.println("==================  Задание 5 ==================");
        Lab05.inversion("This is a test string");
    }
}
