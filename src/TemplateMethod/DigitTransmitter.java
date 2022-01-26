package TemplateMethod;

public class DigitTransmitter extends Transmitter{
    @Override
    protected void simpling() {
        System.out.println("Дискретизация ");
    }

    @Override
    protected void digitization() {
        System.out.println("Оцифровка");
    }

    @Override
    protected void modulation() {
        System.out.println("Модуляция");
    }
}
