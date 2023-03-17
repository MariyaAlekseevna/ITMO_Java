package lab06.Exercise1_Exercise2;

public class Client extends Human {
    public String bankName;

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public void print() {

        System.out.println("Имя клиента: " + getName());
        System.out.println("Фамилия клиента: " + getSurname());
        System.out.println("Название банка: " + bankName);
    }
}
