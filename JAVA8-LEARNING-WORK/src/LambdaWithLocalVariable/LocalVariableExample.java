package LambdaWithLocalVariable;

import java.util.function.Consumer;

public class LocalVariableExample {

    static int a = 10;  //Instance variable.lambda can accept.

    public static void main(String[] args) {
        //int a = 10; //Local variable

        Consumer<Integer> c1 = (i) ->{
            //a = 20; inside lambda(Local variable) its final or effective final. Cannot reassign
            a = 20; //outside method can be reassigned
            System.out.println(a + i);
        };
        c1.accept(2);
    }
}
