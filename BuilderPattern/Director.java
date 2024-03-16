package BuilderPattern;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder){
        this.studentBuilder=studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof MbaStudentBuilder){
            return createMbaStudent();
        }
        if(studentBuilder instanceof EngStudentBuilder){
            return createEngStudent();
        }
        return null;
    }

    public Student createEngStudent(){
        return studentBuilder.setStudentId(1).setFatherName("Raghu").setName("Hemanth").setMotherName("Swathi").setAge(20).setSubjects().build();
    }

    public Student createMbaStudent(){
        return studentBuilder.setStudentId(2).setFatherName("Sriram").setMotherName("Rukmini").setName("Phani").setAge(30).setSubjects().build();
    }
}
