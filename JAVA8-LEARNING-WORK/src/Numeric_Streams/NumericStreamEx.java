package Numeric_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamEx {

    public static int sumOfNNumbers(List<Integer> integers){
       return integers.stream()
                .reduce(0,(x,y)->x+y); //unboxing to convert the Integer to int
    }

    public static int sumOfNNumbersIntStream(){
        return IntStream.rangeClosed(1,9) //1,2,3,4,5,6
                .sum();
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println("Sum of N Numbers : "+sumOfNNumbers(integerList));
        System.out.println("Sum of N Numbers using IntStream : "+sumOfNNumbersIntStream());
    }
}
