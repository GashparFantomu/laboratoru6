import javax.management.RuntimeMBeanException;

public class Calculator {
    private double result;
    public Calculator() {
        result = 0;
    }

    public void add(double num) {
        result += num;
    }
    public void subtract(double num) {
        result -= num;
    }
    public void multiply(double num) {
        result *= num;
    }
    public void divide(double num) {

        if(num == 0){
            throw new RuntimeException("Division by zero");
        }

    }
    public double getResult() {
        return result;
    }

}
