package facade;

/**
 * Main facade class that simplifies starting and stopping ServerScheduler
 */
public class SchedulerServerFacade {

    private ServerTasks scheduler;

    public SchedulerServerFacade(ServerTasks scheduler) {
        this.scheduler = scheduler;
    }

    /*
     * Only one method for starting a server. Covers all the complexity from ServerTask interface
     * */
    public void startServer() {
        this.scheduler.startBooting();
        this.scheduler.readSystemConfigFile();
        this.scheduler.init();
        this.scheduler.initializeContext();
        this.scheduler.initializeListeners();
        this.scheduler.createSystemObjects();
    }


    /*
     * The only one method for shutting down server. Covers all the complexity from ServerTask interface
     * */
    public void stopServer() {
        this.scheduler.releaseProcesses();
        this.scheduler.destory();
        this.scheduler.shutdown();
    }
}
