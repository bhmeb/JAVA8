package StreamAPI_Factory_Method;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateterateEx {

    public static void main(String[] args) {
        Stream<String> nameStream = Stream.of("Adam","Dam","Julie");
        nameStream.forEach(System.out::println);

        /*Stream.iterate(1,x -> x*2)
                .forEach(System.out::println); //run infinite time once reached max value.
*/
        Stream.iterate(1,x -> x*2)
                .limit(10)
                .forEach(System.out::println); //stop after 10 time print result.

        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier)
                .limit(5)
                .forEach(System.out::println);
    }
}
