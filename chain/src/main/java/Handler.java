import java.util.Map;

public interface Handler {
    public void setNext(Handler next);

    public void handle(Map<String,Object> request);
}