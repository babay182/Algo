package FactoryMethod;

public class Truck implements Iproduction{
    @Override
    public void realise() {
        System.out.println("new Truck");
    }
}
