package AdapterObject;

public class RussianScales implements IScales{
    private float currentWeight;

    public RussianScales(float currentWeight) {
        this.currentWeight = currentWeight;
    }

    @Override
    public float getWheight() {
        return currentWeight;
    }
}
