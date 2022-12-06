package StreamsAPI_TerminalOperations;

import data.Student;
import data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamGroupingByEx {

    public static void groupStudentByGender(){
        Map<String, List<Student>> studentGenderMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(studentGenderMap);
    }

    public static void customizedGroupStudentBy(){
        Map<String, List<Student>> studentGenderMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(student -> student.getGpa()>=3.8 ? "OUTSTANDING":"AVERAGE"));
        System.out.println(studentGenderMap);
    }

    public static void twoLevelGrouping_1(){
       Map<Integer, Map<String,List<Student>>> studentListMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(student -> student.getGpa()>=3.8 ? "OUTSTANDING":"AVERAGE")));
        System.out.println(studentListMap);

    }

    public static void twoLevelGrouping_2(){
        Map<String, Integer> studentListMap2 = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName,
                        summingInt(Student::getNoteBooks)));
        System.out.println(studentListMap2);
    }

    public static void threeArgumentGroupBy(){
        LinkedHashMap<String, Set<Student>> studentHashMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName,LinkedHashMap::new,toSet()));  //return groupingBy(classifier, HashMap::new, downstream);
        System.out.println(studentHashMap);
    }

    public static void calculateToGpaStudent(){
        Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(studentMapOptional);
    }

    public static void calculateToGpaStudent2(){
        Map<Integer, Optional<Student>> studentMapOptional2 = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        minBy(Comparator.comparing(Student::getGpa))));
        System.out.println(studentMapOptional2);
    }

    public static void calculateToGpaStudent4(){
        Map<Integer, Student> studentMapOptional2 = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                         collectingAndThen(minBy(Comparator.comparing(Student::getGpa)),Optional::get)));
        System.out.println(studentMapOptional2);
    }

    public static void calculateToGpaStudent3(){
        Map<Boolean, Map<String,List<Student>>> studentMapOptional = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(student -> student.getGradeLevel()>=3.0 ? true:student.getFlag(),
                        groupingBy(Student::getName)));
        System.out.println(studentMapOptional);
    }

    public static void main(String[] args) {
        //groupStudentByGender();
        //customizedGroupStudentBy();
        //twoLevelGrouping_1();
        //twoLevelGrouping_2();
        //threeArgumentGroupBy();
        //calculateToGpaStudent();
        //calculateToGpaStudent2();
        calculateToGpaStudent4();
        //calculateToGpaStudent3();

    }
}
