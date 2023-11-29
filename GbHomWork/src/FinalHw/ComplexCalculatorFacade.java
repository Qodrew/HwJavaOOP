package FinalHw;

public class ComplexCalculatorFacade {
    private final ComplexCalculator calculator;

    public ComplexCalculatorFacade() {
        this.calculator = new ComplexCalculator();
    }

    public ComplexNumber add(double realNum1, double imaginaryNum1, double realNum2, double imaginaryNum2) {
        ComplexNumber num1 = new ComplexNumber(realNum1, imaginaryNum1);
        ComplexNumber num2 = new ComplexNumber(realNum2, imaginaryNum2);
        ComplexNumber result = calculator.add(num1, num2);
        System.out.println("Рузультат сложения: " + num1 + " + " + num2 + " = " + result);
        return result;
    }

    public ComplexNumber multiply(double realNum1, double imaginaryNum1, double realNum2, double imaginaryNum2) {
        ComplexNumber num1 = new ComplexNumber(realNum1, imaginaryNum1);
        ComplexNumber num2 = new ComplexNumber(realNum2, imaginaryNum2);
        ComplexNumber result = calculator.multiply(num1, num2);
        System.out.println("Результат умножения: " + num1 + " * " + num2 + " = " + result);
        return result;
    }

    public ComplexNumber divide(double realNum1, double imaginaryNum1, double realNum2, double imaginaryNum2) {
        ComplexNumber num1 = new ComplexNumber(realNum1, imaginaryNum1);
        ComplexNumber num2 = new ComplexNumber(realNum2, imaginaryNum2);
        ComplexNumber result = calculator.divide(num1, num2);
        System.out.println("Результат деления: " + num1 + " / " + num2 + " = " + result);
        return result;
    }
}
