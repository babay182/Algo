package Builder;

public class AndroidDev implements Developer{

    private Phone phone;

    public AndroidDev() {
        phone = new Phone();
    }

    @Override
    public void createDisplat() {
         phone.appendData("display Samsung ");
    }

    @Override
    public void createBox() {
        phone.appendData("box Samsung ");
    }

    @Override
    public void systemInstall() {
        phone.appendData("install Android ");
    }

    @Override
    public Phone getPhone() {
        return phone;
    }
}
