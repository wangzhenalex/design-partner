/*reciver*/
public class ApplicationServer {
    private String ip;

    public ApplicationServer(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void dump(){
        System.out.println("[" + ip +"]mysqldump -uroot -p --all-databases > /backup/mysqldump/all.db ");
    }

    public void syncTime(){
        System.out.println("[" + ip +"]ntpdate 0.asia.pool.ntp.org");
    }

    public void shutdown(){
        System.out.println("[" + ip +"]showdown now");
    }

}
