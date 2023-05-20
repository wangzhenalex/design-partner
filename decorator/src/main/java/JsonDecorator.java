import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.Map;

public class JsonDecorator implements DataSource {
    private DataSource dataSource;

    public JsonDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }



    @Override
    public void writeData(String data) {
        dataSource.writeData(toJson(data));
    }

    @Override
    public String readData() {
        return fromJson(dataSource.readData());
    }

    private String toJson(String stringData) {
        Map map = new HashMap();
        map.put("content", stringData);
        return new Gson().toJson(map);
    }

    private String fromJson(String json) {
        Map map = new Gson().fromJson(json,new TypeToken<Map<String,String>>(){}.getType());
        return map.get("content").toString();
    }
}