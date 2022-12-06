package Java8_Default_Static_Method;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8DefaultMethodEx1 {

    public static void main(String[] args) {

        List<String> stringList  = Arrays.asList("Adam", "Jenny", "Alex","Eric","Mike");

        Collections.sort(stringList);
        System.out.println("Sorted list by using Collections: " +  stringList);

        System.out.println();
        //Java8
        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sorted list : " +  stringList);

        System.out.println();
        stringList.sort(Comparator.reverseOrder());
        System.out.println("Reverse Sorted list : " +  stringList);

        //spliterator is use for parallel program.
    }
}
