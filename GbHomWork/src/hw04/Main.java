package hw04;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calculator01 = new Calculator();
        System.out.println("Сумма:");
        System.out.println(calculator01.sum(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println(calculator01.sum(Arrays.asList(1.43, 2.34, 3.12, 4.43, 5.32)));

        System.out.println("Умножение:");
        System.out.println(calculator01.multiply(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println(calculator01.multiply(Arrays.asList(1.43, 2.34, 3.12, 4.43, 5.32)));

        System.out.println("Деление:");
        System.out.println(calculator01.divide(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println(calculator01.divide(Arrays.asList(1.43, 2.34, 3.12, 4.43, 5.32)));

        System.out.println("Двоичная сс для целых чисел:");
        System.out.println(calculator01.toBinary(Arrays.asList(1, 2, 3, 4, 5)));        
        System.out.println(calculator01.toBinary(Arrays.asList("2", "2", "3", "4", "5")));
        
        // System.out.println(calculator01.toBinary(Arrays.asList(1.43, 2.34, 3.12, 4.43, 5.32)));
    }
}
