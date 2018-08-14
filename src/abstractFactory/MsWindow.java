package abstractFactory;

public class MsWindow implements Window {
    private String title;

    public MsWindow(String title) {
        this.title = title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void repaint() {
        System.out.println("Repait window " + this.title);
    }
}
