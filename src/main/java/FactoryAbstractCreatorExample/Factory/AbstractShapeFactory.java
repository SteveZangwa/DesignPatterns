package FactoryAbstractCreatorExample.Factory;

import FactoryAbstractCreatorExample.Shape;

public abstract class AbstractShapeFactory {
    protected abstract Shape factoryMethod();
    public Shape getShape(){
        return factoryMethod();
    }
    // other helper method

}
