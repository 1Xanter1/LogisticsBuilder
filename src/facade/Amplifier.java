package facade;

public class Amplifier {
    private int volume;
    private DvdPlayer dvdPlayer;
    boolean on;

    public void on(){
        on = true;
        System.out.println("Amplifier is on");
    }
    public void off(){
        on = false;
        System.out.println("Amplifier is off");
    }
    public void setDvdPlayer(DvdPlayer dvdPlayer){
        this.dvdPlayer = dvdPlayer;
        System.out.println("DvdPlayer is connected to Amplifier");
    }
    public void setSurroundVolume(){
        requireOn();
        System.out.println("Surround volume is on");
    }
    public void setVolume(int volume){
        requireOn();
        if (volume < 0 || volume > 100){
            System.out.println("Volume must be between 0 and 100");
        }
        this.volume = volume;
        System.out.println("Volume is set to " + volume);
    }
    private void requireOn(){
        if (!on){
            throw new IllegalStateException("Amplifier must be on");
        }
    }
}
