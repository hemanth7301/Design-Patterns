package CompositePattern;

public class Main {
    public static void main(String[] args) {

        Directory movieDirectory = new Directory("Movie");
        FileSystem saaho = new File("Saaho");
        movieDirectory.add(saaho);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File rrr = new File("Run Raja Run");
        comedyMovieDirectory.add(rrr);

        Directory HorrorMovieDirectory = new Directory("HorroMovie");
        File annabelle = new File("Annabelle");
        HorrorMovieDirectory.add(annabelle);

        movieDirectory.add(comedyMovieDirectory);
        movieDirectory.add(HorrorMovieDirectory);
        movieDirectory.ls();

    }
}
