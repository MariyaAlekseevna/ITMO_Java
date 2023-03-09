package lab02.Calculator;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(12.5, 13.5));
        System.out.println(calculator.sum(12L, 13L));
        System.out.println(calculator.sum(12, 13));

        System.out.println(calculator.division(12.5, 13.5));
        System.out.println(calculator.division(12L, 13L));
        System.out.println(calculator.division(12, 13));

        System.out.println(calculator.multiplication(12.5, 13.5));
        System.out.println(calculator.multiplication(12L, 13L));
        System.out.println(calculator.multiplication(12, 13));

        System.out.println(calculator.subtraction(12.5, 13.5));
        System.out.println(calculator.subtraction(12L, 13L));
        System.out.println(calculator.subtraction(12, 13));
    }
}
