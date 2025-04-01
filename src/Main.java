

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        AdvancedCalculator advCalculator = new AdvancedCalculator();
        calculator.add(7);
        calculator.add(5);
        calculator.subtract(3);
        calculator.divide(3);

        advCalculator.squareRoot(2);
        advCalculator.power(2);

        System.out.println(calculator.getResult());
        System.out.println(advCalculator.getResult());
    }
}