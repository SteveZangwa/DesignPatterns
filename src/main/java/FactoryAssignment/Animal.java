package FactoryAssignment;

interface Animal {
    void speak();

}
class Duck implements Animal{

    @Override
    public void speak() {
        System.out.println("Duck says Pack-Pack");
    }
}
class Tiger implements Animal{

    @Override
    public void speak() {
        System.out.println("Tiger says Halum - Halum ");
    }
}
