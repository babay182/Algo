package AbstractFactory;

public class RussianEngine implements IEngine{
    @Override
    public void releaseEngine() {
        System.out.println("russian engine)))");
    }
}
