package BridgePattern;

public class GreenCircle implements DrawApi{
    public void draw(int radius,int x,int y){
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
