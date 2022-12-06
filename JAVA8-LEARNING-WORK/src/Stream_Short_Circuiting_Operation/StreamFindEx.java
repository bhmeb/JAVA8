package Stream_Short_Circuiting_Operation;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamFindEx {

    //Return type always Optional

    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3)
                .findAny();
    }

    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }

    public static void main(String[] args) {

        Optional<Student> studentOptional = findAnyStudent();
        if(studentOptional.isPresent()){
            System.out.println("Found the students: " + studentOptional.get());
        }else {
            System.out.println("No student is found");
        }

        Optional<Student> studentOptional2 = findFirstStudent();
        if(studentOptional2.isPresent()){
            System.out.println("Found the students findAny: " + studentOptional2.get());
        }else {
            System.out.println("No student is found");
        }
    }
}
