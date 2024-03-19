package AdapterPattern;

public class AudioPlayer {
    public static void main(String args[]){
        Mp3Player mediaPlayer = new Mp3Player();
        mediaPlayer.play("mp3", "jalsa");
        mediaPlayer.play("mp4", "vikram");
        mediaPlayer.play("vlc", "Movie");
        mediaPlayer.play("mp5", "Hemanth");
    }
}
