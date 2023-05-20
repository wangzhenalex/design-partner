import java.util.ArrayList;
import java.util.List;

public class ShutdownCommand implements Command{
    List<ApplicationServer> instanceList = new ArrayList();
    public ShutdownCommand(ApplicationServer instance){
        instanceList.add(instance);
    }
    public ShutdownCommand(List<ApplicationServer> instances){
        this.instanceList = instances;
    }

    @Override
    public void execute() {
        for (ApplicationServer instance : instanceList){
            System.out.println("[" + instance.getIp() +"]正在执行关机命令SHUTDOWN");
            instance.shutdown();
        }
        System.out.println("======================");
    }
}