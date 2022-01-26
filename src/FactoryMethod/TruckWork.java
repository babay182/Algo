package FactoryMethod;

public class TruckWork implements CarWorckShop{
    @Override
    public Iproduction create() {
        return new Truck();
    }
}
