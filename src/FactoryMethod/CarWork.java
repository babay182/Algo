package FactoryMethod;

public class CarWork implements CarWorckShop{
    @Override
    public Iproduction create() {
        return new Car();
    }
}
