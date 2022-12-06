package FI_Function;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class StudentFunctionExample {

    static List<Student> studentList = StudentDataBase.getAllStudents();

    static Function<List<Student>, Map<String,Double>> function = (students -> {

        Map<String,Double> studentGradeMap = new HashMap<>();

        students.forEach(student -> {
            studentGradeMap.put(student.getName(),student.getGpa());
        });
        return studentGradeMap;
    });

    public static void main(String[] args) {
        System.out.println(function.apply(studentList));
    }
}