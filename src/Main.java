

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        AdvancedCalculator advCalculator = new AdvancedCalculator();
        calculator.add(7);
        calculator.add(5);
        calculator.subtract(3);
        calculator.divide(3);

        advCalculator.divide(3);
        double finalResult = advCalculator.squareRoot(54).power(32).getResult();

        System.out.println(calculator.getResult());
        System.out.println(advCalculator.getResult());
    }
}