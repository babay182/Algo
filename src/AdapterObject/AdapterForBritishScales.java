package AdapterObject;

public class AdapterForBritishScales implements IScales{
    BritishScales britishScales;

    public AdapterForBritishScales(BritishScales britishScales) {
        this.britishScales = britishScales;
    }

    @Override
    public float getWheight() {
        return britishScales.getCurrentWeight() * 0.453f;
    }
}
