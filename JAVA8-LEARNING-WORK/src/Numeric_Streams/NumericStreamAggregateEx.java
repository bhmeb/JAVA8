package Numeric_Streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateEx {

    /*Aggregate Functions:
    sum()
    max()
    min()
    average()*/

    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1,50).sum();
        System.out.println("Sum is: " + sum);

        OptionalInt optionalInt = IntStream.rangeClosed(1,50).max();
        System.out.println(optionalInt.isPresent());
        System.out.println("Max value is: " + optionalInt);
        System.out.println(optionalInt.isPresent() ? optionalInt.getAsInt() : 0);

        OptionalInt optionalInt2 = IntStream.rangeClosed(0,0).max();
        System.out.println(optionalInt2.isPresent());
        System.out.println("Max value is: " + optionalInt2);
        System.out.println(optionalInt2.isPresent() ? optionalInt2.getAsInt() : 0);
        System.out.println(IntStream.rangeClosed(0,0).count());


       OptionalLong optionalLong = LongStream.rangeClosed(50,100).min();
       System.out.println(optionalLong.isPresent() ? optionalLong.getAsLong() : 0);


       OptionalDouble optionalDouble = IntStream.rangeClosed(1,50).average();
       System.out.println(optionalDouble.isPresent() ? optionalDouble.getAsDouble() : 0);
    }
}
