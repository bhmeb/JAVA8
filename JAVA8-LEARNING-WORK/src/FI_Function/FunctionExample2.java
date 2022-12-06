package FI_Function;

public class FunctionExample2 {

    public static String performConcat(String str){
        return FunctionExample.concatString.apply(str);
    }

    public static void main(String[] args) {
        String result = performConcat("hello");
        System.out.println("Result is : " + result);
    }
}
