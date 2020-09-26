package AbstractFactoryExample;

public abstract class AbstractFactory {
    abstract Color getColor(String colorType);
    abstract Shape getShape(String shapeType);

}

class ColorFactory extends AbstractFactory{

    @Override
    Color getColor(String colorType) {
       if(colorType == null) {
           return null;
       }
       if(colorType.equalsIgnoreCase("Red"))
           return new Red();
       else if (colorType.equalsIgnoreCase("Green"))
           return new Green();
       else if(colorType.equalsIgnoreCase("Blue"))
           return new Blue();
       else
           return null;
    }
    @Override
    Shape getShape(String ShapeType) {
        return null;
    }
}
class ShapeFactory extends AbstractFactory{

    @Override
    Color getColor(String colorType) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        if (shapeType == null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        else if (shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        else {
            return null;
        }

    }
}
