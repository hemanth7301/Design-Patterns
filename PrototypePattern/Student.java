package PrototypePattern;

public class Student implements Prototype{

    int studentId;
    int studentAge;
    String studentName;

    Student(int studentId,int studentAge,String studentName){
        this.studentName=studentName;
        this.studentAge=studentAge;
        this.studentId=studentId;
    }
    
    public Prototype Clone(){
        return new Student(studentId, studentAge, studentName);
    }

}
