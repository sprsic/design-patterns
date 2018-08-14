package abstractFactory;

public class MsWindowFactory implements AbstractFactory {
    @Override
    public Window createWindow() {
        return new MsWindow("Some cool MS window title");
    }
}
