package Predidate_Consumer;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumerExample {

    static List<Student> studentList = StudentDataBase.getAllStudents();
    static Predicate<Student> p1 = (p) -> p.getGradeLevel()>=3;
    static Predicate<Student> p2 = (p) -> p.getGpa()>=3.9;

    BiConsumer<String, List<String>> biConsumer = (name,activities) -> System.out.println(name + " : " + activities);

    Consumer<Student> studentConsumer = (student -> {
        if(p1.and(p2).test(student)){
            biConsumer.accept(student.getName(), student.getActivities());
        }
    });

    public void studentNameActivities(List<Student> students){
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {

        new PredicateConsumerExample().studentNameActivities(studentList);
    }
}
