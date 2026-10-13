package facade;

public class Client {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        Lights lights = new Lights();
        PopcornPopper popcornPopper = new PopcornPopper();
        HomeTheaterFacade facade = new HomeTheaterFacade(amplifier, dvdPlayer, projector, screen, lights, popcornPopper);

        facade.watchMovie("Dark knight");
        System.out.println("---Movie finished---");
        facade.endMovie();
    }
}
