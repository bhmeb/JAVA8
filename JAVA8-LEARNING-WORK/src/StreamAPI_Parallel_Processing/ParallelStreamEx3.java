package StreamAPI_Parallel_Processing;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamEx3 {

    public static long checkPerformanceResult(Supplier<Integer> supplier,int numberOfTimes){
        long startTime = System.currentTimeMillis();
        for(int i=0;i<numberOfTimes;i++){
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }

    public static int sumOfSequentialStream(){ //it's like a Supplier bcz its doesn't take any input but returning Integer
        return IntStream.rangeClosed(1,1000)
                .sum();
    }

    public static int sumOfParallelStream(){ //it's like a Supplier bcz its doesn't take any input but returning Integer
        return IntStream.rangeClosed(1,1000)
                .parallel()
                .sum();
    }
    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println("Sequential Stream result: " + checkPerformanceResult((ParallelStreamEx3::sumOfSequentialStream),20));
        System.out.println("Parallel Stream result: " + checkPerformanceResult((ParallelStreamEx3::sumOfParallelStream),20));

    }
}
