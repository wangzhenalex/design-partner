import java.util.ArrayList;
import java.util.List;

/**
 * Client客户端
 */
public class Client {
    public static void main(String[] args) {

        List<ApplicationServer> instanceList = new ArrayList<>();
        instanceList.add(new ApplicationServer("192.168.31.223"));
        instanceList.add(new ApplicationServer("192.168.31.203"));
        instanceList.add(new ApplicationServer("192.168.31.126"));
        instanceList.add(new ApplicationServer("192.168.31.183"));
        /*
        for(ApplicationServer server:instanceList){
            server.syncTime();
            server.dump();
            server.syncTime();
            server.shutdown();
        }*/

        /**
         * script.conf
         * =====================
         * SyncTimeCommand
         * DumpCommand
         * SyncTimeCommand
         * ShutdownCommand
         */
        ManageServer shellExecutor = new ManageServer();
        shellExecutor.addCommand(new SyncTimeCommand(instanceList));
        shellExecutor.addCommand(new DumpCommand(instanceList));
        shellExecutor.addCommand(new SyncTimeCommand(instanceList));
        shellExecutor.addCommand(new ShutdownCommand(instanceList));
        shellExecutor.execute();
    }
}
