package FI_Consumer;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    //print name and activities with two consumer instances
    public static Consumer<Student> c2 = (student) -> System.out.println(student);
    public static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
    public static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());
    public static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void printAllStudent(){
        System.out.println("Method call: - printAllStudent()");
        studentList.forEach(c2);
    }

    public static void printNameAndActivities(){
        System.out.println("Method call: - printNameAndActivities()");
        studentList.forEach(c3.andThen(c4));  //consumer chaining
    }

    public static void printNameAndActivitiesUsingConditions(){
        System.out.println("Method call: - printNameAndActivitiesUsingConditions()");
        studentList.forEach(student -> {
            if(student.getGradeLevel()>=3 && student.getGpa()>=3.9){
                c3.andThen(c4).accept(student);
            }
        });
    }

    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("java8");

        printAllStudent();
        printNameAndActivities();
        printNameAndActivitiesUsingConditions();
    }
}
