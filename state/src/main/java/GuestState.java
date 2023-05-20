public class GuestState extends UserState {

    public GuestState(User user) {
        super(user);
    }

    @Override
    public void play4K() {
        throw new RuntimeException("游客禁止播放4K视频");
    }

    @Override
    public void play720P() {
        System.out.println(user.getUname() + "正在播放720P视频");
    }

    @Override
    public void play1080P() {
        throw new RuntimeException("游客禁止播放1080P视频");
    }
}