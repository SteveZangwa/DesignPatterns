package AbstractFactoryExample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryProducerTest {

    @Test
    public void Display() throws Exception {
        // get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        // get an object of shape circle
        Shape shape = shapeFactory.getShape("Circle");
        // call a method draw of shape circle
        shape.draw();
        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("Square");
        shape2.draw();

        // get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        // get an object of red color
        Color color = colorFactory.getColor("Red");
        // call a method fill of color red
        color.fill();
        Color color1 = colorFactory.getColor("Green");
        color1.fill();
        Color color2 = colorFactory.getColor("Blue");
        color2.fill();

    }
}