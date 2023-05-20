public abstract class ChatMediator {
    public abstract void register(User user);
    public abstract void notice(User user, String message);
}