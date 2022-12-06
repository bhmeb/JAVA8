package Java8_Default_Static_Method;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Java8DefaultMethodEx2 {

    static Consumer<Student> studentConsumer = (student -> System.out.println(student));
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getName);


    public static void sortByName(List<Student> studentList){
        System.out.println("After sort Name:");
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    public static void sortByGPA(List<Student> studentList){
        System.out.println("After sort GPA:");
        Comparator<Student> nameComparator = Comparator.comparingDouble(Student::getGpa);
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    public static void gradeComparator(List<Student> studentList){
        System.out.println("After sort gradeComparator:");
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);
    }

    public static void sortWithNullValue(List<Student> studentList){
        System.out.println("After sort sortWithNullValue:");
        //Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator); //null value will print first
        Comparator<Student> studentComparator = Comparator.nullsLast(nameComparator); //null value will print last
        studentList.sort(studentComparator);
       studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Before sort name:");
        studentList.forEach(studentConsumer);

        //sortByName(studentList);
        //sortByGPA(studentList);
        //gradeComparator(studentList);
        sortWithNullValue(studentList);
    }
}
