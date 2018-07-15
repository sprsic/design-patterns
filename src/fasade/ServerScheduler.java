package fasade;

public class ServerScheduler implements ServerTasks {
    @Override
    public void startBooting() {
        System.out.println("Start booting...");
    }

    @Override
    public void readSystemConfigFile() {
        System.out.println("Loading system config...");
    }

    @Override
    public void init() {
        System.out.println("Init server...");
    }

    @Override
    public void initializeContext() {
        System.out.println("Initialising server context.");
    }

    @Override
    public void initializeListeners() {
        System.out.println("Initialising listeners.");
    }

    @Override
    public void createSystemObjects() {
        System.out.println("Creating system objects");
    }

    @Override
    public void releaseProcesses() {
        System.out.println("Releasing all processes.");
    }

    @Override
    public void destory() {
        System.out.println("Destroying server.");
    }

    @Override
    public void shutdown() {
        System.out.println("Server shutdown.");
    }

}
