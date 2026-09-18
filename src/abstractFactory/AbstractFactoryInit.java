package abstractFactory;
// Client
public class AbstractFactoryInit {
    public static void main(String[] args) {
        // Showcases of both concrete factories

        GUIFactory factory = new WindowsFactory();

        GUIFactory factory2 = new MacOSFactory();

        Button windowsButton = factory.createButton();
        Button macOSButton = factory2.createButton();
        Checkbox windowsCheckbox = factory.createCheckbox();
        Checkbox macOSCheckbox = factory2.createCheckbox();

        windowsButton.render();
        macOSButton.render();
        windowsCheckbox.render();
        macOSCheckbox.render();
    }
}
