public class Main {
    public static void main(String args[]){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.getShape("Rectangle");
        Shape circle = shapeFactory.getShape("Circle");
        Shape square = shapeFactory.getShape("Square");
        rectangle.draw();
        square.draw();
        circle.draw();
    }
}
