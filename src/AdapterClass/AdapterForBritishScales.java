package AdapterClass;

public class AdapterForBritishScales extends BritishScales implements IScales{
    public AdapterForBritishScales(float currentWeight) {
        super(currentWeight);
    }

    @Override
    public float getWeight() {
        return super.getCurrentWeight() * 0.453f;
    }

    @Override
    public void adjust() {
        super.adjust();
        System.out.println("отрегулировали");
    }
}
