public abstract class User {
    protected String name;
    public String getName(){
        return name;
    }
    protected ChatMediator mediator;

    public User(ChatMediator mediator){
        this.mediator = mediator;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}