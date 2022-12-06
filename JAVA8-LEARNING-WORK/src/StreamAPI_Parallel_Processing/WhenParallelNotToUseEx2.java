package StreamAPI_Parallel_Processing;

import java.util.stream.IntStream;

public class WhenParallelNotToUseEx2 {

    public static void main(String[] args) {

        Sum sum = new Sum();
        IntStream.rangeClosed(1,10000)
                //.parallel()
                .forEach(sum::performSum);
        System.out.println(sum.getTotal());

    }
}

class Sum{
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void performSum(int input){
        total = total+input;
    }
}
