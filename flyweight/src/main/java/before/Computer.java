package before;

import java.util.List;
/*电脑*/
public class Computer {
    //商品唯一编码
    private String sn;
    //商品名
    private String title;
    //品牌
    private String brand;
    //商品图文描述
    private String description;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
