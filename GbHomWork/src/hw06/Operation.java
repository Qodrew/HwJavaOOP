package hw06;

import java.util.List;

public interface Operation {
        Double execute(List<? extends Number> arr);
}
