import java.util.ArrayList;
import java.util.List;

/**
 * OSS目录类
 */
public class OssDirectory implements OssNode {
    private List<OssNode> subNodes = new ArrayList<>();
    String path = null;

    /**
     * 指定绝对路径
     * @param path
     */
    public OssDirectory(String path){
        this.path = path;
    }



    /**
     * 指定父级目录，采用相对路径
     * @param parent 上级目录对象
     * @param dirName 目录名
     */
    public OssDirectory(OssDirectory parent , String dirName){
        parent.addChild(this);
        this.path = parent.getPath() + dirName;
    }

    /**
     * 得到当前目录路径
     * @return
     */
    @Override
    public String getPath() {
        return path;
    }

    @Override
    public String getType() {
        return "directory";
    }

    /**
     * 增加子节点
     * @param node
     */
    public void addChild(OssNode node){
        this.subNodes.add(node);
    }

    /**
     * 移除子节点
     * @param node
     */
    public void removeChild(OssNode node){
        this.subNodes.remove(node);
    }

    /**
     * 返回所有子节点
     * @return
     */
    public List<OssNode> getChildren(){
        return this.subNodes;
    }
}
