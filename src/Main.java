import AdapterClass.AdapterForBritishScales;
import AdapterClass.IScales;
import AdapterClass.RussianScales;
import AdapterObject.BritishScales;
import ChainOfResponsibility.Carpenters;
import ChainOfResponsibility.Designer;
import ChainOfResponsibility.FinishWorker;
import Decorator.*;
import Facade.MarketPlace;
import FactoryMethod.Car;
import Iterator.DataStack;
import Prototype.IAnimal;
import Prototype.Sheep;
import Proxy.ISite;
import Proxy.Site;
import Proxy.SiteProxy;
import Singlton.Singl;
import TemplateMethod.AnalogTransmitter;
import TemplateMethod.DigitTransmitter;
import TemplateMethod.Transmitter;

public class Main{
    public static void main(String[] args) {
//        Director director = new Director(new AndroidDev());//Builder
//        Phone samsung = director.MountFullPhone();
//        System.out.println(samsung.aboutPhone());
//        director.setDeveloper(new IphoneDev());
//        Phone iPhone = director.MountFullPhone();
//        System.out.println(iPhone.aboutPhone());

//        CarWorckShop creator = new CarWork();// Factory Method
//        Iproduction car = creator.create();
//        creator = new TruckWork();
//        Iproduction truck = creator.create();
//        car.realise();
//        truck.realise();

//        IFactory jFactory = new JapanesFactory();//Abstract factory
//        IEngine jEngine = jFactory.createEngine();
//        ICar jCar = jFactory.createCar();
//        IFactory rFactory = new RussianFactory();
//        IEngine rEngine = rFactory.createEngine();
//        ICar rCar = rFactory.createCar();

//        IAnimal sheepDonor = new Sheep();//Prototype
//        sheepDonor.setName("Dolly");
//        IAnimal sheepClone = sheepDonor.clone();
//        System.out.println(sheepClone.getName());
//        System.out.println(sheepDonor.getName());

//        float kg = 55.0f;//Adapter Object
//        float lb = 55.0f;//фунты
//        IScales rScales = new RussianScales(kg);
//        IScales bScales = new AdapterForBritishScales(new BritishScales(lb));
//        System.out.println(rScales.getWheight());
//        System.out.println(bScales.getWheight());

//        IScales rCsales = new RussianScales(55.0f);//Adapter Claas
//        IScales bCsales = new AdapterForBritishScales(55.0f);
//        System.out.println(rCsales.getWeight());
//        System.out.println(bCsales.getWeight());
//        rCsales.adjust();
//        bCsales.adjust();

//        IProcessor transmitter = new Transmitter("1234");//Decorator
//        transmitter.process();
//        Shell hammingCoder = new HamingCoder(transmitter);
//        hammingCoder.process();
//        Shell encryptor = new Encryptor(hammingCoder);
//        encryptor.process();

//        ISite mySite = new SiteProxy(new Site());
//        System.out.println(mySite.getPage(1));
//        System.out.println(mySite.getPage(2));
//        System.out.println(mySite.getPage(3));
//        System.out.println(mySite.getPage(2));

//        DataStack myStack1 = new DataStack();//Iterator
//        for (int i = 0; i < 5; i++) {
//            myStack1.push(i);}
//        DataStack myStack2 = new DataStack(myStack1);
//        System.out.println(DataStack.equals(myStack1,myStack2));
//        myStack2.push(10);
//        System.out.println(DataStack.equals(myStack1,myStack2));

//        Transmitter analogTransmitter = new AnalogTransmitter();//Шаблонный метод
//        analogTransmitter.processStart();
//        System.out.println();
//        Transmitter digitalTransmitter = new DigitTransmitter();
//        digitalTransmitter.processStart();

//        Designer designer = new Designer();//Цепочка обязанностей
//        Carpenters carpenters = new Carpenters();
//        FinishWorker finishWorker = new FinishWorker();
//        designer.setNextWorker(carpenters).setNextWorker(finishWorker);
//        System.out.println(designer.execute("спроектировать дом"));
//        System.out.println(designer.execute("класть кирпич"));
//        System.out.println(designer.execute("клеить обои"));
//        System.out.println(designer.execute("пить пиво"));

//        MarketPlace marketPlace = new MarketPlace();
//        marketPlace.productReceipt();
//        System.out.println("--------------");
//        marketPlace.productRelease();

        Singl s1 = Singl.getSengl();//Singlton
        Singl s2 = Singl.getSengl();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }

}
