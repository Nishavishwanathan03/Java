import java.util.InputMismatchException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try
         {
            System.out.println("enter the whole number to divide:");
            int x = scanner.nextInt();
            System.out.println("enter the whole number to divide by:");
            int y= scanner.nextInt();
            int z= x/y;
            System.out.println("result1 " +  z);
         }
        
        catch(ArithmeticException e){
System.out.println("you can't divide by zero! 01011!");
        }
        catch(InputMismatchException e){
            System.out.println("you can't enter string!");
        }
        finally{
scanner.close();
        }
    }
 }
    

