package lab02.Smartphone;

import java.awt.*;

public class Smartphone {
    private String brand;
    private String model;
    private Color color;
    Integer memory;
    private long price;
    boolean isNew;

    public Smartphone () {
    }

    public Smartphone(String brand, String model, Color color, Integer memory, long price, boolean isNew) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.memory = memory;
        this.price = price;
        this.isNew = isNew;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "Бренд= '" + brand + '\'' +
                ", Модель= '" + model + '\'' +
                ", Цвет= " + color +
                ", Объем памяти= " + memory +
                ", Цена= " + price +
                ", Новый= " + isNew +
                '}';
    }
}
