package FI_Predicates;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    public static Predicate<Student> p1 = (p) -> p.getGradeLevel()>3;
    public static Predicate<Student> p2 = (p) -> p.getGpa()>=3.9;
    public static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void filterNameByGradeLevel(){
        System.out.println("-------- Call filterNameByGradeLevel ---------------");
        studentList.forEach(student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterNameByGpa(){
        System.out.println("-------- Call filterNameByGpa ---------------");
        studentList.forEach(student -> {
            if(p2.test(student)){
                System.out.println(student);
            }
        });
    }
    public static void filterNameByGpaAndGradeLevel(){
        System.out.println("-------- Call filterNameByGpaAndGradeLevel ---------------");
        studentList.forEach(student -> {
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }else{
                System.out.println(student);
            }
        });
    }

    public static void filterNameByGpaOrGradeLevel(){
        System.out.println("-------- Call filterNameByGpaAndGradeLevel ---------------");
        studentList.forEach(student -> {
            if(p1.or(p2).test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterNameByGpaNegateGradeLevel(){
        System.out.println("-------- Call filterNameByGpaAndGradeLevel ---------------");
        studentList.forEach(student -> {
            if(p2.negate().test(student)){
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterNameByGradeLevel();
        filterNameByGpa();
        filterNameByGpaAndGradeLevel();
        filterNameByGpaOrGradeLevel();
    }
}
