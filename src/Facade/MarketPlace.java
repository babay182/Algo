package Facade;

public class MarketPlace {
    private ProviderCommunication providerCommunication;
    private Site site;
    private Database database;

    public MarketPlace() {
        providerCommunication = new ProviderCommunication();
        site = new Site();
        database = new Database();
    }

    public void productReceipt(){
        providerCommunication.receive();
        site.placement();
        database.insert();
    }

    public void productRelease(){
        providerCommunication.payment();
        site.del();
        database.del();
    }
}
