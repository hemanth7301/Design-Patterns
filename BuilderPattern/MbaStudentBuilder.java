package BuilderPattern;
import java.util.ArrayList;
import java.util.List;

public class MbaStudentBuilder extends StudentBuilder{
    public StudentBuilder setSubjects(){
        List<String>subjects=new ArrayList<>();
        subjects.add("Economics");
        subjects.add("Management");
        subjects.add("Micro");
        this.subjects=subjects;
        return this;
    }
}

