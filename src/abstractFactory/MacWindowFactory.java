package abstractFactory;

public class MacWindowFactory implements AbstractFactory {
    @Override
    public Window createWindow() {
        return new MacWindow("Some cool MAC window title");
    }
}
