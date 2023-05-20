public abstract class  AbstractHandler implements Handler {
    private Handler next;
    public void setNext(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }
}