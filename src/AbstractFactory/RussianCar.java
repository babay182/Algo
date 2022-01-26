package AbstractFactory;

public class RussianCar implements ICar{
    @Override
    public void releaseCar(IEngine engine) {
        System.out.println("new Russian car");
        engine.releaseEngine();
    }
}
