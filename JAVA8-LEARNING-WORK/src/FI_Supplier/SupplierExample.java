package FI_Supplier;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Student> supplier = () ->{
            return new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
        };
        System.out.println("Student is: " + supplier.get());

        Supplier<List<Student>> studentSupplier = () -> StudentDataBase.getAllStudents();
        System.out.println("Student are: " + studentSupplier.get());
    }
}
