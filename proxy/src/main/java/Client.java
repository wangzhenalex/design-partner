public class Client {
    public static void main(String[] args) {
        VideoDownloader downloader = new YoutubeDownloaderProxy();
        downloader.download("http://www.youtube.com/xxx");
        downloader.download("http://www.youtube.com/yyy");
        downloader.download("http://www.youtube.com/xxx");
    }
}
