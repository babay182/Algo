package AdapterClass;

public class BritishScales {
    private float currentWeight;

    public BritishScales(float currentWeight) {
        this.currentWeight = currentWeight;
    }

    public float getCurrentWeight() {
        return currentWeight;
    }

    protected void adjust(){
        System.out.println("Регулировка британских весов");
    }
}
