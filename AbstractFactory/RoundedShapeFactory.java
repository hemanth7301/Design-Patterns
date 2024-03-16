package AbstractFactory;

public class RoundedShapeFactory extends AbstractFactory{
    public Shape getShape(String shape){
        if(shape.equals("Rounded Rectangle")){
            return new RoundedRectangle();
        }
        if(shape.equals("Rounded Square")){
            return new RoundedSquare();
        }
        return null;
    }
}
