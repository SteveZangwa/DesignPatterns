package FactoryAbstractCreatorExample.Factory;

import FactoryAbstractCreatorExample.Shape;
import FactoryAbstractCreatorExample.Square;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareFactoryTest {

    @Test
    public void display() {
        // get an object of square and call its draw method
        Shape shape = new SquareFactory().getShape();
        shape.draw();

    }
}