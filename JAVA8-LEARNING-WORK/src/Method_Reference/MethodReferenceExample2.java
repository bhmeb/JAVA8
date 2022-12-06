package Method_Reference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

public class MethodReferenceExample2 {

    //static Predicate<Student> p1 = (p) -> p.getGradeLevel()>=2;
    static Predicate<Student> p1 = MethodReferenceExample2::graterThenGradeLevel;

    public static boolean graterThenGradeLevel(Student s){
        return s.getGradeLevel()>3;
    }

    public static void main(String[] args) {

        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));

    }
}
