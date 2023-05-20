import java.util.ArrayList;
import java.util.List;

public class SyncTimeCommand implements Command{
    List<ApplicationServer> instanceList = new ArrayList();
    public SyncTimeCommand(ApplicationServer instance){
        instanceList.add(instance);
    }
    public SyncTimeCommand(List<ApplicationServer> instances){
        this.instanceList = instances;
    }

    @Override
    public void execute() {
        for (ApplicationServer instance : instanceList){
            System.out.println("[" + instance.getIp() +"]正在执行时钟校准SYNCTIME");
            instance.syncTime();
        }
        System.out.println("======================");
    }
}
