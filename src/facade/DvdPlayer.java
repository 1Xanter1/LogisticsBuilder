package facade;

public class DvdPlayer {
    private String movie;
    private boolean playing;

    public void on(){
        System.out.println("Player is on");
    }
    public void off(){
        System.out.println("Player is off");
    }
    public void play(String movie){
        if(movie == null || movie.isBlank()){
            throw new  IllegalArgumentException("Player is empty");
        }
        this.movie = movie;
        this.playing = true;
        System.out.println(movie + "is playing");
    }
    public void stop(){
        if(playing) {
            this.playing = false;
            movie =  null;
        } else{
            System.out.println("No movie is playing");
        }
    }
    public void eject(){
        stop();
        System.out.println("DVD ejected");
    }
}
