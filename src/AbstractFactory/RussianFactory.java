package AbstractFactory;

public class RussianFactory implements IFactory{
    @Override
    public IEngine createEngine() {
        return new RussianEngine();
    }

    @Override
    public ICar createCar() {
        return new RussianCar();
    }
}
