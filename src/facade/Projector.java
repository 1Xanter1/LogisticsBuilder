package facade;

public class Projector {
    private boolean on;

    public void on() {
        on = true;
        System.out.println("Projector is ON");
    }

    public void setWidescreenMode() {
        if (!on) {
            throw new IllegalStateException(
                    "Projector must be ON"
            );
        }
        System.out.println("Widescreen mode enabled");
    }
    public void off() {
        on = false;
        System.out.println("Projector is OFF");
    }
}
