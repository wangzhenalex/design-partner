//硬件工程师关注硬件
public class HardwareEngineer implements Visitor{
    @Override
    public void visit(Server server) {
        if(server.getStatus().equals("down")){
            System.out.println("硬件工程师报告：[" + server.getIp() + "]服务器已宕机，正在人工重启");
        }else if(server.getStatus().equals("up")){
            System.out.println("硬件工程师报告：[" + server.getIp() + "]服务器状态正常");
        }else if(server.getStatus().equals("unknown")){
            System.out.println("硬件工程师报告：[" + server.getIp() + "]服务器状态未知，正在排查故障");
        }
    }
}