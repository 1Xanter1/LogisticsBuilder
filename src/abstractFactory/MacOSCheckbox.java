package abstractFactory;
// Concrete Product
public class MacOSCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering MacOS checkbox");
    }
}
