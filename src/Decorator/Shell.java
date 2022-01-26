package Decorator;

public abstract class Shell implements IProcessor{
    protected IProcessor processor;

    public Shell(IProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void process() {
        processor.process();
    }
}
