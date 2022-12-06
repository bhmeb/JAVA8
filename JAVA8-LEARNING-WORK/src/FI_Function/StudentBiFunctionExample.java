package FI_Function;

import FI_Predicates.PredicateStudentExample;
import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class StudentBiFunctionExample {

    static List<Student> studentList = StudentDataBase.getAllStudents();

    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction = ((students, studentPredicate) -> {
        Map<String,Double> studentMap = new HashMap<>();
        studentList.forEach(student -> {
            if(studentPredicate.test(student)){
                studentMap.put(student.getName(),student.getGpa());
            }
        });

        return studentMap;
    });

    public static void main(String[] args) {
        System.out.println(biFunction.apply(studentList, PredicateStudentExample.p2));
    }
}
