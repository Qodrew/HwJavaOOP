package hw04;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public Double sum(List<? extends Number> arr) {
        double res = 0;
        for (Number number : arr) {
            res += number.doubleValue();
        }
        return res;
    }
    
    public Double multiply(List<? extends Number> arr) {
        double res = 1;
        for (Number number : arr) {
            res *= number.doubleValue();
        }
        return res;
    }

    public Double divide(List<? extends Number> arr) {
        double res = arr.get(0).doubleValue();
        for (int i = 1; i < arr.size(); i++) {
            double value = arr.get(i).doubleValue();
            if (value == 0.0) {
                throw new ArithmeticException("Список содержит 0. Деление на '0' невозможно");
            }
            res /= value;
        }
        return res;
    }

    public List<String> toBinary(List<?> arr) {
        List<String> binaryList = new ArrayList<>();
        for (Object element : arr) {
            if (element instanceof Number) {
                long longValue = ((Number) element).longValue();
                binaryList.add(Long.toBinaryString(longValue));
            } else if (element instanceof String) {
                try {
                    double doubleValue = Double.parseDouble((String) element);
                    long longValue = (long) doubleValue;
                    binaryList.add(Long.toBinaryString(longValue));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Неверный формат для бинарного перевода");
                }
            } else {
                throw new IllegalArgumentException("Неподдерживаемый тип данных для бинарного перевода");
            }
        }
        return binaryList;
    }

}
