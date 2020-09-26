package FactoryConcreteCreatorExample;

public class ShapeFactory {
    // use getShape method to get object of type shape
    public  Shape getShape(String shapeType){

        if (shapeType.equalsIgnoreCase("Circle"))
            return new Circle();
        else if(shapeType.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        else if(shapeType.equalsIgnoreCase("Square"))
            return new Square();
        else
         return null;
    }
}
