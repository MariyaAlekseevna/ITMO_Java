package lab10;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("==================  Задание 1 ==================");
        System.out.println(Lab10.fileToListOfStrings("files/lab10/textEx1.txt"));

        System.out.println("==================  Задание 2 ==================");
        Lab10.writeStringToFile("В отличие от других языков программирования, таких как C или C ++ , однако, программы Java не компилируются в машинный код; вместо этого они преобразуются в нейтральный по архитектуре формат байт-кода. ", "files/lab10/textEx2.txt");
        Lab10.writeStringToFile("Этот набор байтов представляет собой код абстрактной виртуальной машины Java (JVM). ", "files/lab10/textEx2.txt");
        Lab10.writeStringToFile("Чтобы эти байты выполнялись на физической машине, интерпретатор Java, работающий на этой физической машине, должен переводить эти байты в локальные действия, такие как печать строки или рисование кнопки. ", "files/lab10/textEx2.txt");
        System.out.println(Lab10.fileToListOfStrings("files/lab10/textEx2.txt"));

        System.out.println("==================  Задание 3 ==================");
        Lab10.mergeFiles("files/lab10/textFirstEx3.txt", "files/lab10/textSecondEx3.txt");
        System.out.println("Произведено слияние файлов.");

        System.out.println("==================  Задание 4 ==================");
        Lab10.replaceInFile("files/lab10/textEx4.txt");
        System.out.println("Замена завершена.");
    }
}