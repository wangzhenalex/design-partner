//软件工程师关注软件
public class SoftwareEngineer implements Visitor{
    @Override
    public void visit(Server server) {
        if(server.getAppPid()==0){
            System.out.println("软件工程师报告：[" + server.getIp() + "]服务器OA系统进程消失，正在尝试重启应用");
        }else{
            System.out.println("软件工程师报告：[" + server.getIp() + "]服务器OA系统运行正常");
        }
    }
}