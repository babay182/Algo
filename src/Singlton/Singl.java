package Singlton;

public class Singl {
    private volatile static Singl singl;

    private Singl() {
    }

    public static Singl getSengl(){
        synchronized (Singl.class) {
            if (singl == null) {
                singl = new Singl();
            }
        }
        return singl;
    }
}
