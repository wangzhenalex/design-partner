import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //客户端根据需要派人巡查
        IDC idc = new IDC();
        Visitor he = new HardwareEngineer();

        idc.check(he);
        Visitor se = new SoftwareEngineer();
        idc.check(se);

        Visitor dba = new DBA();
        idc.check(dba);

    }
}