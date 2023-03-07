package lab03.Car;

public class Car {

    public String title;
    public String color;
    public double weight;

    public Car() {
    }

    public Car(String color) {
        this.title = color;
    }

    public Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car(String title, String color, double weight) {
        this.title = title;
        this.color = color;
        this.weight = weight;
    }

    public String printCar() {
        return "Название: " + title + "; Цвет: " + color + "; Вес: " + weight;
    }
}
