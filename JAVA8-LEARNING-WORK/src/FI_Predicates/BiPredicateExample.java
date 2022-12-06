package FI_Predicates;

import Predidate_Consumer.PredicateConsumerExample;
import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BiPredicateExample {

    static List<Student> studentList = StudentDataBase.getAllStudents();

    //static Predicate<Student> p1 = (p) -> p.getGradeLevel()>=3;
    //static Predicate<Student> p2 = (p) -> p.getGpa()>=3.9;

    BiPredicate<Integer,Double> biPredicate = (gradeLevel,gpa) -> (gradeLevel>=3 && gpa>=3.9);

    BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);

    Consumer<Student> studentConsumer = (student -> {
        if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
            biConsumer.accept(student.getName(), student.getActivities());
        }
    });

    public void studentNameActivities(List<Student> students){
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        new PredicateConsumerExample().studentNameActivities(studentList);
    }
}
