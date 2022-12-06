package StreamAPI_Dummp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceEx1 {

        //Reduced takes two arguments ->
        //1. initial value
        //2. Binary Operator
        public static int reduceEx(List<Integer> integerList) {
            return integerList.stream().reduce(1, (a,b) -> (a*b));
        }

        public static Optional<Integer> reduceEx2(List<Integer> integerList) {
            return integerList.stream().reduce((a,b) -> (a*b)); //Without Identity
        }


        public static void main(String[] args) {

            List<Integer> integerList = Arrays.asList(1,6,3,5,9);
            List<Integer> integerList1 = new ArrayList<>();
            System.out.println( reduceEx(integerList));

            Optional<Integer> result = reduceEx2(integerList);
            System.out.println(result.isPresent());
            System.out.println(result.get());

            Optional<Integer> result1 = reduceEx2(integerList1);
            System.out.println(result1.isPresent());
            if(result1.isPresent()){
                System.out.println(result1.get());
            }

        }
}
