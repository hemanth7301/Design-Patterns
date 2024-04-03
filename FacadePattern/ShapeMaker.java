package FacadePattern;

public class ShapeMaker {

    Shape rectangle;
    Shape square;
    Shape triangle;

    ShapeMaker(){
        rectangle = new Rectangle();
        square = new Square();
        triangle = new Triangle();
    }
    
    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }

    public void drawTriangle(){
        triangle.draw();
    }

}
