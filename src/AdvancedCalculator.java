public class AdvancedCalculator extends Calculator {
    public AdvancedCalculator() {
        super();
    }
    void squareRoot(int num){
        result = Math.sqrt(num);
    }

    void power(int num){
        result = Math.pow(num, result);
    }

    void sin(int num){
        result = Math.sin(num);
    }
}
