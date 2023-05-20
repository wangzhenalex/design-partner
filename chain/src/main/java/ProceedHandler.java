import java.util.Map;

public class ProceedHandler extends AbstractHandler{
    @Override
    public void handle(Map<String,Object> request) {

        System.out.println("请求已被转发给业务系统，完成后续业务处理");
    }
}
