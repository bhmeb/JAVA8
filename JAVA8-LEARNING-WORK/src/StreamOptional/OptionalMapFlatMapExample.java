package StreamOptional;

import data.Bike;
import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    //filter
    public static void optionalFilter() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        studentOptional
                .filter(student -> student.getGpa() >= 3.9)
                .ifPresent(student -> System.out.println(student));
    }

    //flatMap

    public static void optionalFlatMap(){
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> name = optionalStudent.filter(student -> student.getGpa()>=3.5)
                .flatMap(Student::getBike)
                .map(Bike::getName);
       name.ifPresent(s -> System.out.println("Name: "+s));


    }


    //map
    public static void optionalMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(studentOptional.isPresent()){
            Optional<String> stringOptional = studentOptional
                    .filter(student -> student.getGpa() >= 3.9)
                    .map(Student::getName);
            System.out.println(stringOptional.get());
        }

    }

        public static void main(String[] args) {
            //optionalFilter();
            //optionalMap();
            optionalFlatMap();
        }
}
