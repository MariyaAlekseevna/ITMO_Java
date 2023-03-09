package lab03.Tree;

public class Tree {
    private String name;
    private int age;
    private boolean living;

    public Tree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Tree(String name, int age, boolean living) {
        this.name = name;
        this.age = age;
        this.living = living;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        return "Название: " + name + ", возраст:" + age + ", дерево живое: " + living;
    }
}
