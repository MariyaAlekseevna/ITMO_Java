package lab09;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("==================  Задание 2 ==================");
        List listEx2 = Arrays.asList("spring", "winter", "summer", "autumn", "summer", "spring");
        System.out.println(Lab09.collectionWithoutDuplicates(listEx2));

        System.out.println("==================  Задание 3 ==================");
        Lab09.randomSelectionTime();

        System.out.println("==================  Задание 4 ==================");
        User mariya = new User();
        mariya.setName("Мария");
        User ivan = new User();
        ivan.setName("Иван");
        User inna = new User();
        inna.setName("Инна");

        Map<User, Integer> users = new HashMap<>();
        users.put(mariya, 1503);
        users.put(ivan, 56441);
        users.put(inna, 890);

        Lab09.userPoints(users);
    }
}
