package Stream_Short_Circuiting_Operation;

import data.StudentDataBase;

public class StreamMatchesEx {

    public static boolean allMatch(){
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa()>=3.9);
    }

    public static boolean anyMatch(){
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa()>=4.0);
    }

    public static boolean noneMatch(){
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>=4.1);
    }

    public static void main(String[] args) {

        System.out.println("Result of all Match: " + allMatch());
        System.out.println("Result of any Match: " + anyMatch());
        System.out.println("Result of none Match: " + noneMatch());  //oppsite of allMatch

    }
}
