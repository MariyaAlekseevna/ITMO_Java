package lab06.Exercise1_Exercise2;

public class Main {
    public static void main(String[] args) {

        Client mariya = new Client("Мария", "Хворостова", "Сбербанк");
        mariya.print();

        BankEmployee ivan = new BankEmployee("Иван", "Денисов", "ВТБ");
        ivan.print();

        Printable dmitry = new Client("Дмитрий", "Михайлов", "Открытие");
        dmitry.print();

        Printable igor = new BankEmployee("Игорь", "Шишмарин", "Альфа-банк");
        igor.print();
    }
}
