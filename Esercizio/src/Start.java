
import java.time.LocalDateTime;

public class Start {

    public static void main(String[] args) {
        //System.out.println("Create a new file");
        String fileToWrite = "C:\\Users\\Utente-PC\\Documents\\DevelhopeFile.txt";
        LocalDateTime oggi = LocalDateTime.now();
        IWriteAndRead wr = new Metodi();
        wr.write(String.valueOf(oggi), fileToWrite);
        wr.read(fileToWrite);
    }
}
