package FactoryAbstractCreatorExample.Factory;

import FactoryAbstractCreatorExample.Shape;
import org.junit.Test;

public class CircleFactoryTest {

    @Test
    public void display() {
        // get an object of Circle and call its draw method
        Shape shape = new CircleFactory().getShape();
        shape.draw();

    }
}