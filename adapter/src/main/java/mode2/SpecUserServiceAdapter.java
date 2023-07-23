package mode2;

import com.google.gson.Gson;

import java.util.List;
import java.util.Map;

public class SpecUserServiceAdapter implements SpecUserService {
    private UserService userService;
    public SpecUserServiceAdapter(UserService userService){
        this.userService = userService;
    }
    @Override
    public String findByJId() {
        Map user = userService.findById();
        String json = new Gson().toJson(user);
        return json;
    }


    @Override
    public String findJUsers() {
        List<Map> users = userService.findUsers();
        String json = new Gson().toJson(users);
        return json;
    }
}
