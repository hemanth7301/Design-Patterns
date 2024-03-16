package AbstractFactory;

public class ShapeFactory extends AbstractFactory{
    public Shape getShape(String shape){
        if(shape.equals("Rectangle")){
            return new Rectangle();
        }
        if(shape.equals("Square")){
            return new Square();
        }
        return null;
    }
}
