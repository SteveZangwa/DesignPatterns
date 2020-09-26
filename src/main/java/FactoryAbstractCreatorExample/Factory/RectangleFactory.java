package FactoryAbstractCreatorExample.Factory;

import FactoryAbstractCreatorExample.Rectangle;
import FactoryAbstractCreatorExample.Shape;

public class RectangleFactory extends AbstractShapeFactory{
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
