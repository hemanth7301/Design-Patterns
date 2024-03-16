public class ShapeFactory {
    public Shape getShape(String shape){
        if(shape.equals("Rectangle")){
            return new Rectangle();
        }
        if(shape.equals("Square")){
            return new Square();
        }
        if(shape.equals("Circle")){
            return new Circle();
        }
        return null;
    }
}
