package facade;

public class HomeTheaterFacade {
    private final Amplifier amplifier;
    private final DvdPlayer dvdPlayer;
    private final Projector projector;
    private final Screen screen;
    private final Lights lights;
    private final PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amplifier, DvdPlayer dvdPlayer, Projector projector, Screen screen, Lights lights, PopcornPopper popcornPopper) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(String movie){
        System.out.println("Getting ready to watch a movie");

        try{
            popcornPopper.on();
            popcornPopper.pop();

            lights.dim(20);
            screen.down();

            projector.on();
            projector.setWidescreenMode();

            amplifier.on();
            amplifier.setDvdPlayer(dvdPlayer);
            amplifier.setSurroundVolume();
            amplifier.setVolume(70);

            dvdPlayer.on();
            dvdPlayer.play(movie);
        } catch(RuntimeException e){
            System.out.println("Could not play movie " + movie);
            endMovie();
            throw e;
        }
    }
    public void endMovie(){
        System.out.println("\nShutting down the home theater");

        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();

        amplifier.off();
        projector.off();

        screen.up();
        lights.on();
        popcornPopper.off();

        System.out.println("Home theater is ready for the next movie");
    }
}
