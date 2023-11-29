package FinalHw;

public class ComplexCalculator {
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexNumber(num1.getReal() + num2.getReal(), num1.getImaginary() + num2.getImaginary());
    }

    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        double newReal = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double newImaginary = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        double denominator = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
        if (denominator == 0) {
            throw new ArithmeticException("Деление на ноль не допускается");
        }

        double newReal = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / denominator;
        double newImaginary = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }
}

