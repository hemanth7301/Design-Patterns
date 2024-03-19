package AdapterPattern;

public class MediaAdaptor implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;
    MediaAdaptor(String audioType){
        if(audioType.equals("vlc")){
            advancedMediaPlayer = new VlcPayer();
        }
        else if(audioType.equals("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    public void play(String audioString, String fileName){
        if(audioString.equals("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
        if(audioString.equals("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }
    }
}