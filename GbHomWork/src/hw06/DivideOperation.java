package hw06;

import java.util.List;

public class DivideOperation implements Operation {
    @Override
    public Double execute(List<? extends Number> arr) {
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
}
