package factory;

public class ShapeFactory {

    public Shape getShape(ShapeType shapeType){
        if (shapeType == null) {
            return null;
        }
        return switch(shapeType) {
            case RECTANGLE ->  new Rectangle();
            case SQUARE ->  new Square();
            case CIRCLE ->  new Circle();
        };
    }

    public enum ShapeType {
        RECTANGLE,
        SQUARE,
        CIRCLE
    }

}
