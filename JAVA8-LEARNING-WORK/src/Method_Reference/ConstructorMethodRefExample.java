package Method_Reference;

import data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorMethodRefExample {

    static Supplier<Student> studentSupplier = Student::new;
    static Function<String,Student> function = Student::new;

    public static void main(String[] args) {

        System.out.println(studentSupplier.get());
        System.out.println(function.apply("ABC"));
    }
}
