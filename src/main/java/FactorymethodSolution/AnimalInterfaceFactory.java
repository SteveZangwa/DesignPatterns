package FactorymethodSolution;

public abstract class AnimalInterfaceFactory {
    public abstract AnimalInterface getAnimal(String type) throws Exception;
}

class ConcreteFactory extends AnimalInterfaceFactory{

    @Override
    public AnimalInterface getAnimal(String type) throws Exception {

        switch (type){
            case "Duck":
                return new Duck();
            case "Tiger":
                return new Tiger();
            default:
                throw new Exception("Animal type: " + type + " cannot be instantiated");

        }
    }
}