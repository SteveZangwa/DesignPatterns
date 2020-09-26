package FactoryAbstractCreatorExample.Factory;

import FactoryAbstractCreatorExample.Shape;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleFactoryTest {

    @Test
    public void Display(){
        // get an object of Rectangle and call its draw method
        Shape shape = new RectangleFactory().getShape();
        shape.draw();
    }


}