package FI_Consumer;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){
        //print name and activities with one consumer instance
        BiConsumer<String, List<String>> biConsumer = (name,activities) -> System.out.println("name: " + name + " activities: " + activities);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            biConsumer.accept(student.getName(),student.getActivities());
        });
    }

    public static void main(String[] args) {
        nameAndActivities();
    }
}
