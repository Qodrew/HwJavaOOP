package hw06;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator sumCalculator = new Calculator(new SumOperation());
        System.out.println("Сумма:");
        System.out.println(sumCalculator.performOperation(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println(sumCalculator.performOperation(Arrays.asList(1.43, 2.34, 3.12, 4.43, 5.32)));

        Calculator multiplyCalculator = new Calculator(new MultiplyOperation());
        System.out.println("Умножение:");
        System.out.println(multiplyCalculator.performOperation(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println(multiplyCalculator.performOperation(Arrays.asList(1.43, 2.34, 3.12, 4.43, 5.32)));

        Calculator divideCalculator = new Calculator(new DivideOperation());
        System.out.println("Деление:");
        System.out.println(divideCalculator.performOperation(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println(divideCalculator.performOperation(Arrays.asList(1.43, 2.34, 3.12, 4.43, 5.32)));
    }
}
