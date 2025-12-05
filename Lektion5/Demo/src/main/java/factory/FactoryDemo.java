package factory;

public class FactoryDemo {

    public static void Demo() {

        ShapeFactory factory = new ShapeFactory();

        Shape shape = factory.getShape(ShapeFactory.ShapeType.CIRCLE);
        shape.draw();
        System.out.println("");
        shape = factory.getShape(ShapeFactory.ShapeType.RECTANGLE);
        shape.draw();
        System.out.println("");
        shape = factory.getShape(ShapeFactory.ShapeType.SQUARE);
        shape.draw();

    }

}
