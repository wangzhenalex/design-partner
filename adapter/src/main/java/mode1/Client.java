package mode1;

public class Client {
    public static void main(String[] args) {
        SpecUserService userService = new SpecUserServiceAdapter();
        System.out.println(userService.findJUsers());
    }
}
