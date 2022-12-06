package Java8_Default_Static_Method;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integerList = Arrays.asList(1,2,3);
        System.out.println("Result is: " + multiplier.multiply(integerList));
        System.out.println("default method Result is: " + multiplier.size(integerList));
        System.out.println("static method Result is: " + Multiplier.isEmpty(integerList));


    }
}
