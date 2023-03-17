package lab06.Exercise3;

public class Truck extends Car {

    public int numWheels;
    public int maxWeight;


    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
        System.out.println("Количество колес: " + numWheels);
    }

    public Truck(int w, String m, char c, float s, int numWheels, int maxWeight) {
        super(w, m, c, s);
        this.numWheels = numWheels;
        this.maxWeight = maxWeight;
    }
}
