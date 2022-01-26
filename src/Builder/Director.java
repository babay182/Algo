package Builder;

public class Director {
    private Developer developer;

    public Director(Developer developer) {
        this.developer = developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public Phone MountOnlyPhone(){
        developer.createBox();
        developer.createDisplat();
        return developer.getPhone();
    }

    public Phone MountFullPhone(){
        developer.createBox();
        developer.createDisplat();
        developer.systemInstall();
        return developer.getPhone();
    }
}
