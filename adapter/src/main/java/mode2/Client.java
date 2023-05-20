package mode2;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        SpecUserService specUserService = new SpecUserServiceAdapter(userService);
        System.out.println(specUserService.findJUsers());
    }
}
