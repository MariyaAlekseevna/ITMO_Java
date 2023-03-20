package lab07;

public class Airplane {
    public static class Wing {
        public double wingWeight;

        public void setWingWeight(double weight) {
            this.wingWeight = weight;
        }

        public double getWingWeight() {
            return wingWeight;
        }

        void printWingWeight() {
            System.out.println("Вес крыла: " + wingWeight);
        }
    }
}

