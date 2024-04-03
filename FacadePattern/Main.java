package FacadePattern;

public class Main{
    public static void main(String[] args) {
        ShapeMaker obj = new ShapeMaker();
        obj.drawRectangle();
        obj.drawSquare();
        obj.drawTriangle();
    }
}