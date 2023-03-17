package lab06.Exercise1_Exercise2;

public class BankEmployee extends Human {

    public String bankName;

    public BankEmployee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public void print() {

        System.out.println("Имя сотрудника: " + getName());
        System.out.println("Фамилия сотрудника: " + getSurname());
        System.out.println("Название банка: " + bankName);
    }
}
