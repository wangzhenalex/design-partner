public class VIP extends User {
    public VIP(String name , ChatMediator mediator) {
        super(mediator);
        this.name = name;
        mediator.register(this);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(">>>[VIP]" + name + ":" + message);
        mediator.notice(this, message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(message);
    }
}