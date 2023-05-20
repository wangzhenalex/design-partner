import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Handler authHandler = new AuthHandler();
        Handler cacheHandler = new CacheHandler();
        Handler metricsHandler = new MetricsHandler();
        Handler proceedHandler = new ProceedHandler();

        authHandler.setNext(cacheHandler);
        cacheHandler.setNext(metricsHandler);
        metricsHandler.setNext(proceedHandler);

        Map request = new HashMap<>();
        request.put("username", "admin");
        request.put("password", "admin");
        authHandler.handle(request);
    }
}