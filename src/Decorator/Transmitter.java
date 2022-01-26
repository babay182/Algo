package Decorator;

public class Transmitter implements IProcessor{
    private String data;

    public Transmitter(String data) {
        this.data = data;
    }

    @Override
    public void process() {
        System.out.println("Данные " + data + " переданы по каналу связи");
    }
}
