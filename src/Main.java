import composite.HtmlElement;
import composite.HtmlParentElement;
import composite.HtmlTag;
import facade.SchedulerServerFacade;
import facade.ServerScheduler;

public class Main {

    /*
     * Design patterns types:
     *  - Creational patterns
     *  - Structural patterns
     *  - Behavior patterns
     *
     * */

    public static void main(String[] args) {
        facadeTest();
        compositePattern();
    }

    private static void compositePattern() {
        System.out.println("==== Starting composite pattern ===");
        HtmlTag parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");
        HtmlTag p1 = new HtmlParentElement("<body>");
        p1.setStartTag("<body>");
        p1.setEndTag("</body>");
        parentTag.addChildTag(p1);
        HtmlTag child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Testing html tag library");
        p1.addChildTag(child1);
        child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Paragraph 2");
        p1.addChildTag(child1);
        parentTag.generateHtml();
    }

    private static void facadeTest() {
        System.out.println("==== Facade pattern ===");
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
        SchedulerServerFacade server = new SchedulerServerFacade(scheduleServer);
        server.startServer();
        server.stopServer();
    }
}
