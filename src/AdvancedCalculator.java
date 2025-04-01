public class AdvancedCalculator extends Calculator {
    public AdvancedCalculator() {
        super();
    }
    public AdvancedCalculator squareRoot(int num){
        result = Math.sqrt(num);
        return this;
    }

    public AdvancedCalculator power(int num){
        result = Math.pow(num, result);
        return this;
    }

    public AdvancedCalculator sin(int num){
        result = Math.sin(num);
        return this;
    }
}
