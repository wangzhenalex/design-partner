import java.util.ArrayList;
import java.util.List;

public class DumpCommand implements Command{
    List<ApplicationServer> instanceList = new ArrayList();
    public DumpCommand(ApplicationServer instance){
        instanceList.add(instance);
    }
    public DumpCommand(List<ApplicationServer> instances){
        this.instanceList = instances;
    }

    @Override
    public void execute() {
        for (ApplicationServer instance : instanceList){
            System.out.println("[" + instance.getIp() +"]正在执行备份数据库命令DUMP");
            instance.dump();
        }
        System.out.println("======================");
    }
}