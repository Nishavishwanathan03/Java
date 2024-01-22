import java.time.ZoneOffset;
import java.util.zip.ZipEntry;

public class returntype {
    public static void main(String[] args){

        int x = 7;
        int y = 7;
         int z = add(x,y);
         System.out.println(z);

    }
    static int add(int x,int y){

        int z = x + y;
        return z;
    }

    
}
