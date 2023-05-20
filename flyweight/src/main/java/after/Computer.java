package after;

/*电脑*/
public class Computer {
    //商品唯一编码
    private String sn;
    //规格对象
    private ComputerSpec spec;
    public String getSn() {
        return sn;
    }
    public void setSn(String sn) {
        this.sn = sn;
    }

    public ComputerSpec getSpec() {
        return spec;
    }

    public void setSpec(ComputerSpec spec) {
        this.spec = spec;
    }
}
