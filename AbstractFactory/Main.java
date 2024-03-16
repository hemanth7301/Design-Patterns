package AbstractFactory;

public class Main {
    public static void main(String args[]){
        AbstractFactory shapeFactory = new ShapeFactory();
        Shape rectangle=shapeFactory.getShape("Rectangle");
        Shape square=shapeFactory.getShape("Square");
        rectangle.draw();
        square.draw();

        AbstractFactory roundedShapeFactory = new RoundedShapeFactory();
        Shape roundRectangle=roundedShapeFactory.getShape("Rounded Rectangle");
        Shape roundSquare=roundedShapeFactory.getShape("Rounded Square");
        roundRectangle.draw();
        roundSquare.draw();
    }
}
