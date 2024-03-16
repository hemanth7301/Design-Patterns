package BuilderPattern;

public class Main {
    public static void main(String args[]) {
        Director directorOne = new Director(new EngStudentBuilder());
        Director directorTwo = new Director(new MbaStudentBuilder());

        Student engStudent=directorOne.createEngStudent();
        Student mbaStudent=directorTwo.createMbaStudent();

        System.out.println(engStudent.toString());
        System.out.println(mbaStudent.toString());
    }
}
