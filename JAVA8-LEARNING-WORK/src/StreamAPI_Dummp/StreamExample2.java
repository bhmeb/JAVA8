package StreamAPI_Dummp;

import data.Student;
import data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class StreamExample2 {

    public static List<String> printStudentActivities () {

        List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>
                .flatMap(List::stream) //Stream<String>
                .distinct()
                .collect(toList());

        return studentActivities;
    }

    public static Long countStudentActivities () {

        Long studentActivitiesCount = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>
                .flatMap(List::stream) //Stream<String>
                .distinct()
                .count();
        return studentActivitiesCount;
    }

    public static List<String> sortedStudentActivities () {

        List<String> sortedStudentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>
                .flatMap(List::stream) //Stream<String>
                .distinct()
                .sorted()
                .collect(toList());

        return sortedStudentActivities;
    }

    public static List<Student> customSortedStudentActivities () {
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
    }

    public static List<Student> customSortedStudentGps () {
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());
    }

    public static List<Student> filterStudent() {
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .filter(student -> student.getGender().equals("female"))
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println("List Of Activities: " + printStudentActivities());
        System.out.println("List Of Activities Count: " + countStudentActivities());
        System.out.println("Sorted Student Activities: " + sortedStudentActivities());
        System.out.print("Custom Sorted Student Activities: ");
        customSortedStudentActivities().forEach(System.out::println);

        System.out.println("Filters list of females : " + filterStudent());

    }
}