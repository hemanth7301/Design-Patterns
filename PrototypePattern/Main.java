package PrototypePattern;

public class Main {
    public static void main(String Args[]){
        Student student =new Student(1 , 10, "Hemanth");
        Student objClone= (Student) student.Clone();
        System.out.println(objClone.studentName);
    }
}
