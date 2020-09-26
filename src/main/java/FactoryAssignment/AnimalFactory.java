package FactoryAssignment;

public class AnimalFactory {
    public Animal getAnimal(String animalType){
        if(animalType.equalsIgnoreCase("Duck"))
            return new Duck();
        else if(animalType.equalsIgnoreCase("Tiger"))
            return new Tiger();
        else return null;

    }
}
