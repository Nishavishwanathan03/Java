import java.util.Scanner;

public class oeratttwo  {
public static void main(String[]  args){

Scanner scanner = new Scanner(System.in);

System.out.println(" Yo are playing a game! press q or Q to quit");

String response = scanner.next();

if(response.equals("Q")  && !response.equals("q"))

{
    System.out.println("you conntinue the game");

}
    else {
        System.out.println("you quit the game");


    }



}  

}


