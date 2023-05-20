//Element
public class Server implements Element{
    private String ip; //IP 地址
    private String status; //当前状态,up、down
    private Integer appPid; // OA系统进程PID
    private Float dbfileSize; //数据库文件尺寸(G)

    public Server(String ip, String status, Integer appPid , Float dbfileSize) {
        this.ip = ip;
        this.status = status;
        this.appPid = appPid;
        this.dbfileSize = dbfileSize;
    }

    public Float getDbfileSize() {
        return dbfileSize;
    }

    public void setDbfileSize(Float dbfileSize) {
        this.dbfileSize = dbfileSize;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getAppPid() {
        return appPid;
    }

    public void setAppPid(Integer appPid) {
        this.appPid = appPid;
    }

    //执行访问者具体行为
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}