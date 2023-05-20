public class VipState extends UserState {


    public VipState(User user) {
        super(user);
    }

    @Override
    public void play4K() {
        System.out.println(user.getUname() + "正在播放4K视频");
    }

    @Override
    public void play720P() {
        System.out.println(user.getUname() + "正在播放720P视频");
    }

    @Override
    public void play1080P() {
        System.out.println(user.getUname() + "正在播放1080P视频");
    }
}