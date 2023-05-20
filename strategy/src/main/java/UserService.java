/*Context*/
public class UserService {
    public UserDao dao = null;
    public UserService(UserDao dao) {
        this.dao = dao;
    }

    public void createUser(){
        System.out.println("正在创建用户对象");
        dao.insert();
    }
}
