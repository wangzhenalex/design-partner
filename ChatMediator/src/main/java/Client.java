public class Client {

    public static void main(String[] args) {
        //聊天服务器
        ChatServer chatServer = new ChatServer();

        //三个小伙伴
        User andy = new Member("Andy",chatServer);
        User ben = new VIP("Ben",chatServer);
        User lily = new VIP("Lily",chatServer);


        andy.sendMessage("Hi！Everybody~");
        System.out.println("---------------");
        ben.sendMessage("who likes lol?");
        System.out.println("---------------");
    }
}
