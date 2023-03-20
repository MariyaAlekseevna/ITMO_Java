package lab07;

public class Main {
    public static void main(String[] args) {

        Airplane.Wing wing1 = new Airplane.Wing();
        wing1.setWingWeight(3.8);
        wing1.printWingWeight();

        Airplane.Wing wing2 = new Airplane.Wing();
        wing2.setWingWeight(3.9);
        wing2.printWingWeight();
    }
}
