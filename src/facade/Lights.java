package facade;

public class Lights {
    private int brightness;

    public void dim(int lvl) {
        if(lvl < 0 || lvl > 100){
            throw new IllegalArgumentException("Brightness value must be between 0 and 100");
        }
        brightness = lvl;
        System.out.println("Brightness value set to " + brightness);
    }
    public void on(){
        brightness = 100;
        System.out.println("Lights are on");
    }
}
