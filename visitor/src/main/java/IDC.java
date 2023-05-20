import java.util.ArrayList;
import java.util.List;
//IDC机房存放了多台设备
public class IDC {
    List<Server> serverList = new ArrayList<>();

    public IDC() {
        Server server1 = new Server("192.168.31.101", "up", 818872,1.2f);
        Server server2 = new Server("192.168.31.102", "unknown", 222465,0.8f);
        Server server3 = new Server("192.168.31.103", "down", 0,10.8f);
        Server server4 = new Server("192.168.31.104", "up", 0,6.3f);
        serverList.add(server1);
        serverList.add(server2);
        serverList.add(server3);
        serverList.add(server4);
    }
    //check方法提供巡检
    public void check(Visitor visitor){
        for(Server server:serverList){
            server.accept(visitor);
        }
    }
}