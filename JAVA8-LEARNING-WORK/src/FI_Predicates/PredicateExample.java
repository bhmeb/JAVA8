package FI_Predicates;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p1 = p -> p%2==0;
    static Predicate<Integer> p2 = (p) -> {return p%2==0; };

    public static void predicateAnd(){
        System.out.println("Predicate with and method: " + p1.and(p2).test(10)); //Predicate chaining
        System.out.println("Predicate with and method: " + p1.and(p2).test(9)); //Predicate chaining
    }

    public static void predicateOr(){
        System.out.println("Predicate with or method: " + p1.or(p2).test(10)); //Predicate chaining
        System.out.println("Predicate with or method: " + p1.or(p2).test(9)); //Predicate chaining
    }

    public static void predicateNegate(){
        System.out.println("Predicate with Negate method: " + p1.or(p2).negate().test(9)); //Predicate chaining
        //Negate will reverse a result what even or method evaluated.
    }


    public static void main(String[] args) {
        System.out.println(p1.test(4));
        System.out.println(p2.test(5));

        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
