package FactoryStaticCreatorExample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeFactoryTest {

    @Test
    public void Display() throws Exception {
        Shape shape1 = new ShapeFactory().getShape("Circle");
        shape1.draw();
        Shape shape2 = new ShapeFactory().getShape("Square");
        shape2.draw();
        Shape shape3 = new ShapeFactory().getShape("Rectangle");
        shape3.draw();
    }
}