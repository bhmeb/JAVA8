package StreamAPI_Parallel_Processing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class WhenParallelNotToUseEx {

    public static int sequentialSum(List<Integer> integerList){
        long startTime = System.currentTimeMillis();
        int sum = integerList
                .stream()
                .reduce(0,(x,y) -> x+y);
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in Sequential manner : " + (endTime-startTime));
        return sum;
    }

    public static int parallelSum(List<Integer> integerList){
        long startTime = System.currentTimeMillis();
        int sum = integerList
                .parallelStream()
                .reduce(0,(x,y) -> x+y); //Perform the unboxing from Integer to int
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in parallel manner : " + (endTime-startTime));
        return sum;
    }

    public static void main(String[] args) {
        //List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> integerList = IntStream.rangeClosed(1,100)
                        .boxed()  //Wrapper type to Primitive type.
                        .collect(toList());

        sequentialSum(integerList);
        parallelSum(integerList);
    }
}
