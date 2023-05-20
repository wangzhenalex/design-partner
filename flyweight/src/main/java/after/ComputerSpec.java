package after;
/*具体商品规格*/
public class ComputerSpec {
    private String title;
    //品牌
    private String brand;
    //商品图文描述
    private String description;

    public ComputerSpec(String title, String brand, String description) {
        this.title = title;
        this.brand = brand;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }
}
