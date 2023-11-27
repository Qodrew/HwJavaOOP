package hw06;

import java.util.List;

public class Calculator {
    private final Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public Double performOperation(List<? extends Number> arr) {
        return operation.execute(arr);
    }

}
