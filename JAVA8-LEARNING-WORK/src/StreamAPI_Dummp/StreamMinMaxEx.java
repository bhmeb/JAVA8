package StreamAPI_Dummp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxEx {

    //It will return always 0 bcz default value is 0
   //So keep in mind when we r doing min max operation use Optional to avoid return 0;
    public static int findMinValue(List<Integer> integerList){
       return integerList.stream().reduce(0,(x,y) -> x<y ? x : y);
    }

    public static Optional<Integer> findMinValueWithOptional(List<Integer> integerList){
        return integerList.stream().reduce((x,y) -> x<y ? x : y);
    }

    public static int findMaxValue(List<Integer> integerList){
        return integerList.stream().reduce(0,(x,y) -> x>y ? x : y);
    }

    public static Optional<Integer> findMaxValueWithOptional(List<Integer> integerList){
        return integerList.stream().reduce((x,y) -> x>y ? x : y);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,5,8,9,10,20);
        //List<Integer> integerList = new ArrayList<>();

        int minValue = findMinValue(integerList);
        int maxValue = findMaxValue(integerList);
        System.out.println("Min value: " + minValue);
        System.out.println("Max value: " + maxValue);

        Optional<Integer> result = findMinValueWithOptional(integerList);
        if(result.isPresent()){
            System.out.println("Min value with Optional: " + result.get());
        }else {
            System.out.println("List is empty!");
        }

        Optional<Integer> result2 = findMaxValueWithOptional(integerList);
        if(result.isPresent()){
            System.out.println("Max value with Optional: " + result2.get());
        }else {
            System.out.println("List is empty!");
        }
    }
}
