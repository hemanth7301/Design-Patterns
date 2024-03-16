package BuilderPattern;
import java.util.*;

public class Student {
    int studentId;
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String>subjects;

    public Student(StudentBuilder studentBuilder){
        this.studentId=studentBuilder.studentId;
        this.age=studentBuilder.age;
        this.name=studentBuilder.name;
        this.fatherName=studentBuilder.fatherName;
        this.motherName=studentBuilder.motherName;
        this.subjects=studentBuilder.subjects;
    }

    public String toString(){
         return ""+ " roll number: " + this.studentId +
        " age: " + this.age +
        " name: " + this.name +
        " father name: " + this.fatherName +
        " mother name: " + this.motherName+
        "Subjects :"+ this.subjects.get(0) +" " +this.subjects.get(1) +" " +this.subjects.get(2);

    }
}
