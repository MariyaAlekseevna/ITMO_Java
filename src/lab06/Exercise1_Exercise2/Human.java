package lab06.Exercise1_Exercise2;

abstract class Human implements Printable {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public abstract void print();

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
