package StreamAPI_Dummp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipEx {

    public static Optional<Integer> limit(List<Integer> integers){
        return integers.stream()
                .reduce((x,y) -> (x+y));
    }

    public static Optional<Integer> limit2(List<Integer> integers){
        return integers.stream()
                .skip(1) //only one element is skipped
                //.skip(1) //only two element is skipped
                .reduce((x,y) -> (x+y));
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);

       Optional<Integer> result1 = limit(integerList);
       if(result1.isPresent()) {
           System.out.println("Limit() .... : " + result1.get());
       }else{
           System.out.println("Limit() .... : It might be the List is empty");
       }

        Optional<Integer> result2 = limit2(integerList);
        if(result2.isPresent()) {
            System.out.println("Limit2() .... : " + result2.get());
        }else{
            System.out.println("Limit2() .... : It might be the List is empty");
        }
    }
}
