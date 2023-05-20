import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class YoutubeDownloaderProxy implements VideoDownloader{
    private Map<String,String> cache = new LinkedHashMap();
    private VideoDownloader downloader = null;
    public YoutubeDownloaderProxy(){
        downloader = new YoutubeDownloader();
    }
    @Override
    public byte[] download(String url) {
        synchronized (YoutubeDownloaderProxy.class){
            if(!cache.containsKey(url)){
                byte[] bs = downloader.download(url);
                String cacheFile = "/usr/home/youtube/cache/" + new Random().nextInt(10000) + ".mp4";
                System.out.println("正在将" + url + "视频缓存到本地:" + cacheFile);
                cache.put(url, cacheFile);
                return bs;
            }else{
                String cacheFile = cache.get(url);
                System.out.println("发现" + url + "已被缓存，直接从本地文件" + cacheFile + "提取");
                return new byte[1024];
            }
        }
    }
}
