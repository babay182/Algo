package AbstractFactory;

public class JapanesEngine implements IEngine{
    @Override
    public void releaseEngine() {
        System.out.println("japanes enjine");
    }
}
