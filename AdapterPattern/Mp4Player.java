package AdapterPattern;

public class Mp4Player implements AdvancedMediaPlayer {
    public void playMp4(String fileName){
        System.out.println("playing MP4 "+fileName);
    }
    public void playVlc(String fileName){
        System.out.println("OOPS");
    }
}