public abstract class UserState {
    public UserState(User user) {
        this.user = user;
    }

    protected User user;

    public void setUser(User user) {
        this.user = user;
    }

    public abstract void play4K();
    public abstract void play720P();
    public abstract void play1080P();

}