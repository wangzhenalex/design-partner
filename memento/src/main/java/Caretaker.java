import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录管理者，用于管理不断变化的对象状态
 * 
 */
public class Caretaker {
    //对象变化拥有多个不同的备忘录
    private List<Memento> memmentoList = new ArrayList<>();

    /**
     * 获取历史变化清单
     */
    public List<Memento> getMementoList() {
        return this.memmentoList;
    }

    /**
     * 添加一个新的备忘录
     */
    public void addMememtos(Memento memento) {
        this.memmentoList.add(memento);
    }

}