package abstractFactory;

public class MacWindow implements Window {
    private String title;

    public MacWindow(String title) {
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
