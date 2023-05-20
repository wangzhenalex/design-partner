import java.util.Map;

public class MetricsHandler extends AbstractHandler{
    @Override
    public void handle(Map<String,Object> request) {
        System.out.println("已获取当前运行指标并发送至Prometheus");
        if(this.getNext() != null){
            this.getNext().handle(request);
        }else{
            throw new RuntimeException("请求没有被送达ProceedHandler");
        }
    }
}