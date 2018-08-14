package abstractFactory;

public class GuiBuilder {

    public static Window buildWindow(AbstractFactory factory) {
        return factory.createWindow();
    }

}
