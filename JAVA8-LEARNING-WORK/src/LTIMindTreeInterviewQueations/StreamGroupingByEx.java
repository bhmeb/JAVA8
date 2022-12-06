package LTIMindTreeInterviewQueations;

import data.Student;
import data.StudentDataBase;

import java.util.*;
import java.util.function.Predicate;

import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.groupingBy;

public class StreamGroupingByEx {

    public static void calculateToGpaStudent(){
        Map<Boolean, Map<String,List<Student>>> studentMapOptional = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(student -> student.getGradeLevel()>=4 ? true:student.getFlag(),
                        groupingBy(Student::getName)));
        System.out.print(studentMapOptional);
    }

    public static void studentPartitioningBy(){
        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.8;
        Map<Boolean, List<Student>> partitioningMap = StudentDataBase.getAllStudents().stream()
                //.collect(partitioningBy(gpaPredicate,toSet())); //it's override List to Set only
                .collect(partitioningBy(gpaPredicate,toList())); //it's override List to Set only
        System.out.println(partitioningMap);
    }

    public static void main(String[] args) {
        //calculateToGpaStudent();
        studentPartitioningBy();
    }
}

