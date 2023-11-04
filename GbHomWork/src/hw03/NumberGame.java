package hw03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberGame extends AbstractGame {
    @Override
    protected List<String> generateCharList() {
        List<String> result = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
        return result;
    }
}
