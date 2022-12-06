package Numeric_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingEx {

    //primitive type to Wrapper type
    public static List<Integer> boxing(){
       return IntStream.rangeClosed(1,10)
                //int
                .boxed()
                //Integer
                .collect(Collectors.toList());
    }

    //Wrapper type to primitive type
    public static int unBoxing(List<Integer> integers){
        return integers.stream()
                .mapToInt(Integer::intValue)//IntStream(intValue of the Wrapper class)
                .sum();

    }

    public static void main(String[] args) {
        System.out.println("Boxing: "+ boxing());

        //List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> integerList = boxing();
        System.out.println("unBoxing: "+ unBoxing(integerList));
    }
}
