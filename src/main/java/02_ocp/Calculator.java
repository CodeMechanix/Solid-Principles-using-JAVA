import java.security.InvalidParameterException;

public class Calculator {
    public void calculator(CalculatorOperation calculatorOperation){
        if(calculatorOperation == null){
            throw new InvalidParameterException("Cannot perform operation");
        }
        calculatorOperation.calculation();
    }
}
