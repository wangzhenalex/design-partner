package mode1;

import com.google.gson.Gson;

import java.util.List;
import java.util.Map;

public class SpecUserServiceAdapter extends UserServiceImpl implements SpecUserService{

    @Override
    public String findByJId() {
        Map user = super.findById();
        String json = new Gson().toJson(user);
        return json;
    }


    @Override
    public String findJUsers() {
        List<Map> users = super.findUsers();
        String json = new Gson().toJson(users);
        return json;
    }
}
