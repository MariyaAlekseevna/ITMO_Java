package lab03.House;

import java.util.Calendar;

public class House {
    private String title;
    private int floors;
    private int year;

    public House() {
    }

    void setHouse(String title, int floors, int year) {
        this.title = title;
        this.floors = floors;
        this.year = year;
    }

    public String getHouse() {
        return "Наименование: " + title + ". Количество этажей: " + floors + ". Год постройки: " + year;
    }

    public int numberOfYears() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR) - year;
    }

}
