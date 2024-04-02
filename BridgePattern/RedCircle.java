package BridgePattern;

public class RedCircle implements DrawApi{
    public void draw(int radius,int x,int y){
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
