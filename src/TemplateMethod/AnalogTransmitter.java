package TemplateMethod;

public class AnalogTransmitter extends Transmitter{
    @Override
    protected void modulation() {
        System.out.println("Модуляция основного сигнала");
    }
}
