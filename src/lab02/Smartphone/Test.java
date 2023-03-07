package lab02.Smartphone;

public class Test {
    public static void main(String[] args) {
        Smartphone smartphoneNew = new Smartphone();
        System.out.println(smartphoneNew);

        Smartphone smartphoneSamsS21U = new Smartphone("Samsung", "s21 ultra", Color.BLACK, 256, 50000, false);
        System.out.println(smartphoneSamsS21U.toString());
        System.out.println(smartphoneSamsS21U.getMemory());
        System.out.println(smartphoneSamsS21U.getPrice());

        Smartphone smartphoneIphon14 = new Smartphone("Iphone", "14", Color.WHITE, 128, 60000, true);
        System.out.println(smartphoneIphon14.toString());
        System.out.println(smartphoneIphon14.getBrand());
        System.out.println(smartphoneIphon14.getModel());
    }
}
