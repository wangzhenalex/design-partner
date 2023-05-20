package after;

import java.util.*;

public class Vendor {
    private Map<String , ComputerSpec> specMap = new HashMap<>();
    public Vendor(){
        specMap.put("macbook14s" , new ComputerSpec("MateBook 14s","华为","英特尔Evo 12代酷睿标压i7 16G 1T/14.2英寸90Hz触控"));
        specMap.put("bookpro14", new ComputerSpec("Xiaomi Book Pro 14", "小米", "2.8K超清大师屏 R7-6800H标压 16G 512G"));
    }

    public void purchase(){
        List<Computer> warehouse = new ArrayList();
        for(int i = 0 ; i < 100 ; i++){
            Computer c = new Computer();
            c.setSn(UUID.randomUUID().toString());
            c.setSpec(specMap.get("macbook14s"));
            warehouse.add(c);
        }

        for(int i = 0 ; i < 1000 ; i++){
            Computer c = new Computer();
            c.setSn(UUID.randomUUID().toString());
            c.setSpec(specMap.get("bookpro14"));
            warehouse.add(c);
        }
    }
}
