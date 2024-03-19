package AdapterPattern;

public class VlcPayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName){
        System.out.println("playing VLC "+fileName);
    }
    public void playMp4(String fileName){
        System.out.println("OOPS");
    }
}
