public class DBA implements Visitor {
    @Override
    public void visit(Server server) {
        if (server.getDbfileSize() > 10) {
            System.out.println("DBA报告：[" + server.getIp() + "]数据文件超过10G，正在做IO优化");
        } else
            System.out.println("DBA报告：[" + server.getIp() + "]数据文件未超过10G，不需要额外优化");
    }
}