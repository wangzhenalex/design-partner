public class YoutubeDownloader implements VideoDownloader{
    @Override
    public byte[] download(String url) {
        System.out.println("从Youtube下载视频：" + url);
        return new byte[1024];
    }
}
