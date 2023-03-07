package lab03.Car;

public class Test {
    public static void main(String[] args) {
        Car subaru = new Car("Subaru impreza", "blue", 1.5);
        System.out.println(subaru.printCar());
        Car hyundai = new Car("Hyundai Creta", "black", 1.4);
        System.out.println(hyundai.printCar());
    }

}
