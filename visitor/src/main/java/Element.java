//ELEMENT目标事物
public interface Element {
    //接受访问者，并执行访问者行为
    public void accept(Visitor visitor);
}