package FI_Function;

import java.util.function.Function;

public class FunctionExample {

    static Function<String,String> function = (f) -> f.toUpperCase();
    static Function<String,String> concatString = (f) -> f.toUpperCase().concat("default");

    public static void main(String[] args) {
        System.out.println( function.apply("java7"));
        System.out.println(concatString.apply("java8"));
        System.out.println("Result andThen is : " + function.andThen(concatString).apply("java9")); ////First execute outer function then execute inner function.
        System.out.println("Result compose is : " + function.compose(concatString).apply("java11")); //First execute function in compose then execute outer function.
    }
}
