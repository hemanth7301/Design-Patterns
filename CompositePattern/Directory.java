package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    String directoryName;
    List<FileSystem>fileSystem;

    Directory(String directoryName){
        this.directoryName=directoryName;
        this.fileSystem=new ArrayList<>();
    }
    
    public void add(FileSystem fileName){
        fileSystem.add(fileName);
    }

    public void ls(){
        System.out.println("Directory Name "+directoryName);
        for(FileSystem file:fileSystem){
            file.ls();
        }
    }
}
