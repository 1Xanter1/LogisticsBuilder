package facade;

public class PopcornPopper {
    private boolean on;

    public void on(){
        on = true;
        System.out.println("Popcorn popper is on");
    }
    public void off(){
        on = false;
        System.out.println("Popcorn popper is off");
    }
    public void pop(){
        if (!on){
            throw new IllegalStateException("Popcorn popper must be on");
        }
        System.out.println("Popcorn popper is popping");
    }
}
