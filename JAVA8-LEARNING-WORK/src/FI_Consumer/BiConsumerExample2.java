package FI_Consumer;

import java.util.function.BiConsumer;

public class BiConsumerExample2 {

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a,b) -> {
            System.out.println("a: "+ a + " b: "+ b);
        };

        BiConsumer<Integer, Integer> multiply = (a,b) -> {
            System.out.println("Multiply: " + a*b);
        };

        BiConsumer<Integer, Integer> division = (a,b) -> {
            System.out.println("Division: " + a/b);
        };

        biConsumer.accept("java7", "java8");
        multiply.accept(2,3);
        division.accept(10,2);
        multiply.andThen(division).accept(4,2);
    }
}
