package StreamsAPI_TerminalOperations;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamPartitioningByEx {

    public static void studentPartitioningBy(){
        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.8;
        Map<Boolean, List<Student>> partitioningMap = StudentDataBase.getAllStudents().stream()
                .collect(partitioningBy(gpaPredicate));
        System.out.println("partitioningBy_1: " +partitioningMap);
    }

    public static void studentPartitioningBy2(){
        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.8;
        Map<Boolean, Set<Student>> partitioningMap = StudentDataBase.getAllStudents().stream()
                .collect(partitioningBy(gpaPredicate,toSet())); //it's override List to Set only
        System.out.println("partitioningBy_2: " +partitioningMap);
    }

    public static void main(String[] args) {
        studentPartitioningBy();
        studentPartitioningBy2();
    }
}
