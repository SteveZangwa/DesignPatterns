package FactoryAbstractCreatorExample.Factory;

import FactoryAbstractCreatorExample.Circle;
import FactoryAbstractCreatorExample.Shape;

public class CircleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
