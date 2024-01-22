
import java.io.File;
public class Filefolder {
    public static void main(String[] args){
    File file = new File("secret_message.txt");
    if(file.exists()){
    System.out.println("that file exists!  1O!");
    System.out.println(file.getAbsoluteFile());
    System.out.println(file.isFile());
    file.delete();
    


}
    else{
        System.out.println("the fie doesn't exist!");
    }
    }

}
