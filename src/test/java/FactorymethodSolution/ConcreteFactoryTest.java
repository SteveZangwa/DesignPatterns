package FactorymethodSolution;

import org.junit.Test;

public class ConcreteFactoryTest {

    @Test
    public void Display() throws Exception {
       ConcreteFactory concreteFactory = new ConcreteFactory();
       AnimalInterface animalInterface = new ConcreteFactory().getAnimal("Duck");
       animalInterface.speak();
       AnimalInterface animalInterface1 = new ConcreteFactory().getAnimal("Tiger");
       animalInterface1.speak();
       //AnimalInterface animalInterface2 = new ConcreteFactory().getAnimal("Lion");
       //animalInterface2.speak();
    }

}