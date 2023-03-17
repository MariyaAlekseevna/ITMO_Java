package lab06.Exercise5;

public class Child extends Parent {
    private String userName;

    @Override
    public void setData() {
        System.out.println("Введите имя пользователя: ");
        userName = scanner.nextLine();
    }

    public String getUserName() {
        return userName;
    }
}