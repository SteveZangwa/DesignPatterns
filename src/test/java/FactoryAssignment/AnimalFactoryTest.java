package FactoryAssignment;

import org.junit.Test;

public class AnimalFactoryTest {

    @Test
    public void setUp() throws Exception {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal1 = new AnimalFactory().getAnimal("Duck");
        animal1.speak();
        Animal animal2 = new AnimalFactory().getAnimal("Tiger");
        animal2.speak();
    }
}