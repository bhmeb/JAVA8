import java.util.*;

public class aa {
    public static void main(String[] args) {

        //1
       List<String> str = Arrays.asList("Java");
        for(String s : str)
            System.out.println(s);

        //2
        Map<String,String> hm = new HashMap<>();
        hm.put("1","a");
        hm.put("2","b");

       Iterator<String> itr = hm.values().iterator();
       while(itr.hasNext()){
           System.out.println("My MAP: " + itr.next().toString());
       }

    }


}
