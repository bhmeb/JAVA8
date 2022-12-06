package Method_Reference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceExample {

    //lambda function
    static Function<String,String> function = (s) -> s.toUpperCase();
    static Consumer<Student> c1 = (p) -> System.out.println(p);

    //ClassName::MethodName
    static Function<String,String> methodRef = String::toUpperCase;  //Instance method
    static Consumer<Student> methodRef2 = System.out::println;

    //Classname::InstanceMethodName
    static Consumer<Student> c2 = Student::printListOfActivities;


    public static void main(String[] args) {

        System.out.println(function.apply("java8"));
        System.out.println(methodRef.apply("java8"));

        //StudentDatabase.getAllStudent().forEach(c1);
        //StudentDatabase.getAllStudent().forEach(methodRef2);
        StudentDataBase.getAllStudents().forEach(c2);

    }
}
