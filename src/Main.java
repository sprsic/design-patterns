import adapter.*;
import fasade.SchedulerServerFasade;
import fasade.ServerScheduler;

import java.sql.SQLOutput;

public class Main {

    /*
     * Design patterns types:
     *  - Creational patterns
     *  - Structural patterns
     *  - Behavior patterns
     *
     * */

    public static void main(String[] args) {
        fasadeTest();
    }

    private static void fasadeTest() {
        // Simple example of using complex interface for starting server
        ServerScheduler scheduleServer = new ServerScheduler();

        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();

        //Destroying server
        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.shutdown();

        System.out.println("=============================");
        // Much simpler with only 2 methods
        SchedulerServerFasade server = new SchedulerServerFasade(scheduleServer);
        server.startServer();
        server.stopServer();
    }
}
