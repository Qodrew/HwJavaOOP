package FinalHw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ComplexCalculatorFacade calculatorFacade = new ComplexCalculatorFacade();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое комплексное число через пробел. 'Формат: num1 num2' :");
        String inputA = scanner.nextLine();
        ComplexNumber num1 = parseComplexNumber(inputA);

        System.out.println("Введите второе комплексное число через пробел. 'Формат: num1 num2' : ");
        String inputB = scanner.nextLine();
        ComplexNumber num2 = parseComplexNumber(inputB);

        calculatorFacade.add(num1.getReal(), num1.getImaginary(), num2.getReal(), num2.getImaginary());
        calculatorFacade.multiply(num1.getReal(), num1.getImaginary(), num2.getReal(), num2.getImaginary());
        calculatorFacade.divide(num1.getReal(), num1.getImaginary(), num2.getReal(), num2.getImaginary());
    }

    private static ComplexNumber parseComplexNumber(String input) {
        String[] parts = input.split("\\s+");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Неверный формат комплексного числа. Используйте Формат: 'num1 num2' :");
        }

        try {
            double real = Double.parseDouble(parts[0]);
            double imaginary = Double.parseDouble(parts[1]);
            return new ComplexNumber(real, imaginary);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Неверный формат числа.");
        }
    }
}



