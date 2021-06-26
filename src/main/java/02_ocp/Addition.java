public class Addition implements CalculatorOperation {
    private double num1;
    private double num2;

    @Override
    public void calculation() {
        double result = num1 + num2;
    }
}
