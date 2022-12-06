package StreamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMapEx {
    //Convert one type to another type.

    public static List<String> namesList(){
        List<String> studentNamesList = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase) //Stream<String> -> convert to uppercase
                .collect(Collectors.toList());
        return studentNamesList;
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
       List<String> studentNames =  studentList.stream().map(Student::getName).collect(Collectors.toList());
        System.out.println(studentNames);
        System.out.println(namesList());
    }
}
