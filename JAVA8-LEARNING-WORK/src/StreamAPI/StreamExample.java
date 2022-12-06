package StreamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        Predicate<Student> gradeLevelPredicate = (student -> student.getGradeLevel()>=3);
        Predicate<Student> gpaPredicate = (student -> student.getGpa()>=3.9);

        Map<String, List<String>> stringStringMap = StudentDataBase.getAllStudents().stream()
                //.filter(student -> student.getGradeLevel()>=3.0)
                .filter(gradeLevelPredicate)
                .filter(gpaPredicate)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(stringStringMap);


        Map<String, List<String>> stringStringMap2 = StudentDataBase.getAllStudents().parallelStream()
                //.filter(student -> student.getGradeLevel()>=3.0)
                .filter(gradeLevelPredicate)
                .filter(gpaPredicate)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(stringStringMap2);
    }
}
