package Java8_Default_Static_Method;

import java.util.List;

public class MultiplierImpl implements Multiplier{

    //Business logic
    @Override
    public int multiply(List<Integer> integersList) {
        return integersList.stream()
                .reduce(1,(x,y) -> x*y);
    }
}
