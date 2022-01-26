package FactoryMethod;

public class Car implements Iproduction{
    @Override
    public void realise() {
        System.out.println("new Car");
    }
}
