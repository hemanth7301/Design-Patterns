package FlyWeightPattern;

public class Circle implements Shape {
    String color;
    int radius;
    int X;
    int Y;

    public Circle(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setX(int x) {
        X = x;
    }

    public void setY(int y) {
        Y = y;
    }

    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color + ", x : " + X + ", y :" + Y + ", radius :" + radius);
    }
}
