package lab03.House;

public class Test {
    public static void main(String[] args) {

        House oldHouse = new House();
        oldHouse.setHouse("Сталинка", 5, 1947);
        System.out.println(oldHouse.getHouse());
        System.out.println(oldHouse.numberOfYears());

        House newHouse = new House();
        newHouse.setHouse("Новостройка", 19, 2016);
        System.out.println(newHouse.getHouse());
        System.out.println(newHouse.numberOfYears());
    }
}
