

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(7);
        calculator.add(5);
        calculator.subtract(3);
        calculator.divide(3);
        System.out.println(calculator.getResult());
    }
}