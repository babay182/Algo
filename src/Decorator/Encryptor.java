package Decorator;

public class Encryptor extends Shell{
    public Encryptor(IProcessor processor) {
        super(processor);
    }

    @Override
    public void process() {
        System.out.println("Шифрование дфнных");
        processor.process();
    }
}
