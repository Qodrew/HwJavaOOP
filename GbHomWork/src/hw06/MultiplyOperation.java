package hw06;

import java.util.List;

public class MultiplyOperation implements Operation {
    @Override
    public Double execute(List<? extends Number> arr) {
        double res = 1;
        for (Number number : arr) {
            res *= number.doubleValue();
        }
        return res;
    }
}

