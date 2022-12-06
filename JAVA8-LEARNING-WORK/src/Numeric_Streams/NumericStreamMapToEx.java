package Numeric_Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapToEx {

    /*public static List<Integer> mapToObject(){
        return IntStream.rangeClosed(1,10)
                .mapToObj((i)->{
                    return new Integer(i);
                })
                .collect(Collectors.toList());
    }*/

    public static long mapToLong(){
        return IntStream.rangeClosed(1,10)
                .mapToLong((i)->i)//Convert IntStream to LongStream
                .sum();
    }

    public static double mapToDouble(){
        return IntStream.rangeClosed(1,10)
                .mapToDouble((i)->i)//Convert IntStream to DoubleStream
                .sum();
    }


    public static void main(String[] args) {

        //System.out.println("mapToObj: " + mapToObject());
        System.out.println("mapToLong: " + mapToLong());
        System.out.println("mapToDouble: " + mapToDouble());

    }
}
