package AbstractFactory;

public class JapanesCar implements ICar{
    @Override
    public void releaseCar(IEngine engine) {
        System.out.println("new Japanes Car");
        engine.releaseEngine();
    }
}
