package Decorator;

public class HamingCoder extends Shell{
    public HamingCoder(IProcessor processor) {
        super(processor);
    }

    @Override
    public void process() {
        System.out.println("Наложен код Хэмминга");
        processor.process();
    }
}
