import java.time.LocalDateTime;

public interface IWriteAndRead {
    void write(String s, String filePath);
    void read(String filePath);
}
