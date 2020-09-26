package FactoryConcreteCreatorExample;

import FactoryAbstractCreatorExample.Factory.CircleFactory;
import FactoryAbstractCreatorExample.Factory.SquareFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeFactoryTest {

    @Test
    public void display() {
        ShapeFactory shapeFactory = new ShapeFactory();
        // get an object of Circle and call its draw method
        Shape shape1 = new ShapeFactory().getShape("Circle");
        shape1.draw();
        // get an object of Rectangle and call its draw method
        Shape shape2 = new ShapeFactory().getShape("Rectangle");
        shape2.draw();
        // get an object of Square and call its draw method
        Shape shape3 = new ShapeFactory().getShape("Square");
        shape3.draw();



    }
}