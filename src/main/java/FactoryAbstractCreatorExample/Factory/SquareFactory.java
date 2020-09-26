package FactoryAbstractCreatorExample.Factory;

import FactoryAbstractCreatorExample.Shape;
import FactoryAbstractCreatorExample.Square;

public class SquareFactory extends AbstractShapeFactory {

    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}
