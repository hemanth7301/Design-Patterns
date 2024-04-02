package BridgePattern;

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(10, 5, 2, new RedCircle());
        Shape greenCircle = new Circle(20, 15, 12, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
