public class MemberState extends UserState {


    public MemberState(User user) {
        super(user);
    }

    @Override
    public void play4K() {
        throw new RuntimeException("普通会员禁止播放4K视频");
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
