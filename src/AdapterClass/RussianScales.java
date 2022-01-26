package AdapterClass;

public class RussianScales implements IScales{
    float currentWeight;

    public RussianScales(float currentWeight) {
        this.currentWeight = currentWeight;
    }

    @Override
    public float getWeight() {
        return currentWeight;
    }

    @Override
    public void adjust() {
        System.out.println("Регулировка российских весов");
    }
}
