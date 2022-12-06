package StreamAPI_Parallel_Processing;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class BuildParallelStreamPipelineEx {

    public static List<String> sequentialPrintStudentActivities(){

        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>> ----stateless
                .flatMap(List::stream) //Stream<String>  ----stateless
                .distinct() //stateful
                .sorted() //stateful
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in Sequential manner : " + (endTime-startTime));
        return studentActivities;
    }
    public static List<String> parallelPrintStudentActivities(){

        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream() //Stream<Student>
                .parallel() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>> ----stateless
                .flatMap(List::stream) //Stream<String>  ----stateless
                .distinct() //stateful
                .sorted() //stateful
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in Parallel manner : " + (endTime-startTime));
        return studentActivities;
    }



    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();
    }
}
