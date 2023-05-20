import java.util.Map;

public class CacheHandler extends AbstractHandler{
    @Override
    public void handle(Map<String,Object> request) {
        System.out.println("已将当前请求转存至Redis缓存");
        if(this.getNext() != null){
            this.getNext().handle(request);
        }else{
            throw new RuntimeException("请求没有被送达ProceedHandler");
        }
    }
}