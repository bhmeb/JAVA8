package StreamAPI_Parallel_Processing;

import java.util.stream.IntStream;

public class ParallelStreamEx {

    public static int sumOfSequentialStream(){
        return IntStream.rangeClosed(1,1000)
                .sum();
    }

    public static int sumOfParallelStream(){
        return IntStream.rangeClosed(1,1000)
                .parallel()
                .sum();
    }
    public static void main(String[] args) {

        System.out.println("Sequential Stream: " + sumOfSequentialStream());
        System.out.println("Parallel Stream: " + sumOfParallelStream());

    }
}
