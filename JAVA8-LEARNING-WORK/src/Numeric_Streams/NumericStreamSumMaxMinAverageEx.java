package Numeric_Streams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamSumMaxMinAverageEx {

    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1,50);
        System.out.println("IntStream.range(1,50) count: "+intStream.count());

        IntStream intStream2 = IntStream.rangeClosed(1,50);
        System.out.println("IntStream.rangeClosed(1,50) count: "+intStream2.count());

        LongStream longStream = LongStream.rangeClosed(1,50);
        System.out.println("LongStream.rangeClosed(1,50) count: "+longStream.count());


        System.out.println("-----------IntStream.range(1,50)------------");
        IntStream.range(1,50).forEach(value -> System.out.print(value+","));

        System.out.println();
        System.out.println("-----------IntStream.rangeClosed(1,50)------------");
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value+ ","));

        System.out.println();
        System.out.println("-----------LongStream.rangeClosed(1,50)------------");
        IntStream.range(1,50).forEach(value -> System.out.print(value+","));

        System.out.println();
        System.out.println("-----------DoubleStream.rangeClosed(1,50)------------");
        IntStream.range(1,50).asDoubleStream().forEach((value -> System.out.print(value+",")));

    }
}
