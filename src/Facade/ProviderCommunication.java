package Facade;

public class ProviderCommunication {
    public void receive(){
        System.out.println("Получение продукции от производителя");
    }
    public void payment(){
        System.out.println("Оплата поставщику с удержанием комиссии за продажу");
    }
}
