package lab09;

import java.util.*;

public class Lab09 {

    // Задание № 2
    public static Set collectionWithoutDuplicates(List listEx2) {
        return new HashSet(listEx2);
    }

    // Задание № 3
    public static void randomSelectionTime() {

        ArrayList<Integer> arrayListEx3 = new ArrayList<>();
        LinkedList<Integer> linkedListEx3 = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 1000000; i++) {
            arrayListEx3.add(random.nextInt(1000000));
            linkedListEx3.add(random.nextInt(1000000));
        }

        long timeArrayListEx3 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayListEx3.get(random.nextInt(10000));
        }
        System.out.println(System.currentTimeMillis() - timeArrayListEx3);

        long timeLinkedListEx3 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedListEx3.get(random.nextInt(10000));
        }
        System.out.println(System.currentTimeMillis() - timeLinkedListEx3);
    }

    // Задание № 4
    public static void userPoints(Map<User, Integer> users) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя игрока: ");
        String name = scanner.nextLine();

        Set<User> keys = users.keySet();
        for (User user : keys) {
            if (name.equals(user.getName())) {
                System.out.println("У игрока \"" + name + "\" " + users.get(user) + " очков.");
                return;
            }
        }
    }
}
