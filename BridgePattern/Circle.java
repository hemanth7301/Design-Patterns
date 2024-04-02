package BridgePattern;

public class Circle extends Shape{
    int radius,x,y;
    Circle(int radius,int x,int y, DrawApi drawApi){
        super(drawApi);
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public void draw(){
        drawApi.draw(radius, x, y);
    }
}
