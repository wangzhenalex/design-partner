//访问者
public interface Visitor {
    //某个具体访问者对于服务器要做什么事？
    void visit(Server server);
}