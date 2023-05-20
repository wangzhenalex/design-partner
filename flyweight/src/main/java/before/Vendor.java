package before;
import java.util.*;

public class Vendor {
    public void purchase(){
        List<Computer> warehouse = new ArrayList();
        for(int i = 0 ; i < 100 ; i++){
            Computer c = new Computer();
            c.setSn(UUID.randomUUID().toString());
            c.setBrand("华为");
            c.setTitle("MateBook 14s");
            c.setDescription("英特尔Evo 12代酷睿标压i7 16G 1T/14.2英寸90Hz触控");
            warehouse.add(c);
        }

        for(int i = 0 ; i < 1000 ; i++){
            Computer c = new Computer();
            c.setSn(UUID.randomUUID().toString());
            c.setBrand("小米");
            c.setTitle("Xiaomi Book Pro 14");
            c.setDescription("2.8K超清大师屏 R7-6800H标压 16G 512G");
            warehouse.add(c);
        }
    }
}
