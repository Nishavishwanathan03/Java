import java.io.FileWriter;
import java.io.IOException;
public class FileWriter {
    public static void main(String[] args){
        FileWriter writer = new FileWriter("poem.txt");
writer.write("ross are red");
writer.close();
catch(IOException e){
    e.printStackTrace();
}

    }
}

    
