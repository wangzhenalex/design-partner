import java.util.ArrayList;
import java.util.List;

public class ChatServer extends ChatMediator {

    private List<User> userList = new ArrayList<>();

    @Override
    public void notice(User user, String message) {
        for (User c : userList) {
            if (!user.equals(c)) {
                c.receiveMessage("<<<" + c.getName() + "收到来自" + user.getName() + "的消息：" + message);
            }
        }
    }

    @Override
    public void register(User user) {
        if (user != null && !userList.contains(user)) {
            userList.add(user);
        }
    }
}
