/**
 * Oss文件对象
 */
public class OssFile implements OssNode{
    private String filename;
    private OssDirectory ossDirectory;

    /**
     * 构造方法
     * @param dir 指定目录
     * @param filename 文件名
     */
    public OssFile(OssDirectory dir ,String filename) {
        this.ossDirectory = dir;
        dir.addChild(this);
        this.filename = filename;
    }

    /**
     * 得到文件路径
     * @return
     */
    @Override
    public String getPath() {
        return ossDirectory.getPath() + filename;
    }

    @Override
    public String getType() {
        return "file";
    }

}
