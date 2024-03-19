package AdapterPattern;

public class Mp3Player implements MediaPlayer{
    MediaAdaptor mediaAdaptor;
    public void play(String audioString,String fileName){
        if(audioString.equals("mp3")){
            System.out.println("Playing mp3 "+fileName);
        }
        else if(audioString.equals("mp4")||audioString.equals("vlc")){
            mediaAdaptor = new MediaAdaptor(audioString);
            mediaAdaptor.play(audioString, fileName);
        }
        else{
            System.out.println("wrong audio type");
        }
    }
}
