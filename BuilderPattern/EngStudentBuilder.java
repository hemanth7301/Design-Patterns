package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class EngStudentBuilder extends StudentBuilder{
    public StudentBuilder setSubjects(){
        List<String>subjects=new ArrayList<>();
        subjects.add("Programming");
        subjects.add("Matrices");
        subjects.add("Thermodynamics");
        this.subjects=subjects;
        return this;
    }
}
