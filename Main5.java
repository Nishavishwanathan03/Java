
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;
public class Main5 {
    public static void main(String[] args)throws UnsupportedAudioFileException,IOException,LineUnavailableException{

        Scanner scanner = new Scanner(System.in);
        File file = new File(null, null);
        AudioInputStream AudioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audiostream);
        String response  = " ";

        

    }
}
