package hw06;

import java.util.List;

public class SumOperation implements Operation {
    @Override
    public Double execute(List<? extends Number> arr) {
        double res = 0;
        for (Number number : arr) {
            res += number.doubleValue();
        }
        return res;
    }
}
