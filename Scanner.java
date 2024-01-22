import  java.util.Scanner;

public class Scanner {
    public static void main (String[]  args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is our name");

        String name = Scanner.nextLine();
        System.out.println("Hello" + name);

    }
    
}
