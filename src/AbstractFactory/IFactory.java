package AbstractFactory;

public interface IFactory {
    IEngine createEngine();
    ICar createCar();
}
