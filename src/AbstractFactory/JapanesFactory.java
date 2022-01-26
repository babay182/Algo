package AbstractFactory;

public class JapanesFactory implements IFactory{
    @Override
    public IEngine createEngine() {
        return new JapanesEngine();
    }

    @Override
    public ICar createCar() {
        return new JapanesCar();
    }
}
