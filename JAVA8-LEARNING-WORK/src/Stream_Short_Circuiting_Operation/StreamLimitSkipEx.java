package Stream_Short_Circuiting_Operation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipEx {

    public static Optional<Integer> normalOptional(List<Integer> integers){
        return integers.stream()
                .reduce((x,y) -> (x+y));
    }

    public static Optional<Integer> limit(List<Integer> integers){
        return integers.stream()
                .limit(3) //only first 3 element will be executed and others will be skiped
                .reduce((x,y) -> (x+y));
    }

    public static Optional<Integer> skip(List<Integer> integers){
        return integers.stream()
                .skip(1) //only one element is skipped
                //.skip(1) //only two element is skipped
                .reduce((x,y) -> (x+y));
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);

       Optional<Integer> result1 = normalOptional(integerList);
       if(result1.isPresent()) {
           System.out.println("normalOptional() .... : " + result1.get());
       }else{
           System.out.println("normalOptional() .... : It might be the List is empty");
       }

        Optional<Integer> result2 = limit(integerList);
        if(result2.isPresent()) {
            System.out.println("Limit() .... : " + result2.get());
        }else{
            System.out.println("Limit() .... : It might be the List is empty");
        }

        Optional<Integer> result3 = skip(integerList);
        if(result3.isPresent()) {
            System.out.println("skip() .... : " + result3.get());
        }else{
            System.out.println("skip() .... : It might be the List is empty");
        }
    }
}
