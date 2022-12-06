package Java8_Default_Static_Method2;

public interface Interface1 {

    default void methodA(){
        System.out.println("Inside Method A - " + Interface1.class);
    }
}
