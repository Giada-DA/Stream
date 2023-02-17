import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDateTime;

public class Metodi implements IWriteAndRead{
    @Override
    public void write(String s, String filePath) {
        try(
            FileWriter writer = new FileWriter(filePath);
            ){
            writer.write("Create a new file \n");
            writer.write("Date and time: " + s);
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void read(String filePath) {
        try(
            FileReader reader = new FileReader(filePath);
            BufferedReader br = new BufferedReader(reader);
            ) {
            while (br.ready()) {
                String line = br.readLine();
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
