package lab03.Tree;

public class Test {
    public static void main(String[] args) {

        Tree oak = new Tree("дуб", 50);
        System.out.println(oak);

        Tree pine = new Tree("сосна", 10, true);
        System.out.println(pine);

        Tree larch = new Tree();
        System.out.println(larch);
    }
}
