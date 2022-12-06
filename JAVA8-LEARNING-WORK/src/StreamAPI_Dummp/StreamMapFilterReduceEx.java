package StreamAPI_Dummp;

import data.Student;
import data.StudentDataBase;

public class StreamMapFilterReduceEx {

    public static int noOfNoteBooks(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>3)
                .map(Student::getNoteBooks)
                //.reduce(0, (a,b)->(a+b));
                .reduce(0, Integer::sum);
    }
    public static void main(String[] args) {

        System.out.println(noOfNoteBooks());

    }
}
