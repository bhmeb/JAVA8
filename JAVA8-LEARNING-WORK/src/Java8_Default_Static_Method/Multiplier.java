package Java8_Default_Static_Method;

import java.util.List;

public interface Multiplier {

    int multiply(List<Integer> integers);

    default int size(List<Integer> integerList){
        return integerList.size();
    }

    static boolean isEmpty(List<Integer> integerList){
        return integerList!=null && integerList.size()>0;
    }
}
