package Builder;

public class IphoneDev implements Developer{

    private Phone phone;

    public IphoneDev() {
        phone = new Phone();
    }

    @Override
    public void createDisplat() {
        phone.appendData("display Iphone ");
    }

    @Override
    public void createBox() {
        phone.appendData("Box Iphone ");
    }

    @Override
    public void systemInstall() {
        phone.appendData("install apple ");
    }

    @Override
    public Phone getPhone() {
        return phone;
    }
}
