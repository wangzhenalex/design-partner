import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        UserDao dao = null;
        switch (input) {
            case "jdbc":
                dao = new JdbcDao();
                break;
            case "odbc":
                dao = new OdbcDao();
                break;
            case "jndi":
                dao = new JndiDao();
                break;
        }
        UserService userService = new UserService(dao);
        userService.createUser();
    }
}
