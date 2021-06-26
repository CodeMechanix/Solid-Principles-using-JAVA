public class Division implements CalculatorOperation {
    private double num1;
    private double num2;

    @Override
    public void calculation() {
        if (num2 != 0) {
            double result = num1 / num2;
        }
    }
}
