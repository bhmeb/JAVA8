package StreamAPI_Dummp;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamReduceEx2 {

    public static Optional<Student> getHighestGPAStudent(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2)->(s1.getGpa()>s2.getGpa()) ? s1 : s2); //Ternary operator
        /*return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2)->{
                        if((s1.getGpa()>s2.getGpa())){
                            return s1;
                        }else{
                            return s2;
                        }
                });*/
    }

    public static void main(String[] args) {

        Optional<Student> studentOptional = getHighestGPAStudent();
        if(studentOptional.isPresent()){
            System.out.println(studentOptional.get());
        }

    }
}
