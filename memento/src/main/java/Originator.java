/**
* 执行者，内部持有原始对象的应用，同时提供创建、还原备忘录的方法
* @author weichyang
* 
*/

public class Originator<T> {
    //内部持有类的引用
    private T object = null;

    public Originator(T object){
        this.object = object;
    }

    public MementoImpl createMemento() {
        return new MementoImpl(object);
    }

    /**
* 将发起人恢复到备忘录对象所记载的状态
*/
    public T restoreMemmento(Memento memmento) {
        this.object = (T)memmento.getSnapshot();
        return object;
    }

    public T getObject() {
        return object;
    }
}