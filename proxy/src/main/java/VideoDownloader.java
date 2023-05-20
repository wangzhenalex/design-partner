import java.io.ByteArrayInputStream;

public interface VideoDownloader {
    public byte[] download(String url);
}
