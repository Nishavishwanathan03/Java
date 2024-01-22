import java. util.Scanner;
public class hypotnuse {
    public static void main(String[] args){

        double x ;
        double y; 

        double z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the side of x");
        x = scanner.nextDouble();

        System.out.println("enter the side of y");
        y = scanner.nextDouble();


        z = Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotnuse is:" +z);

        scanner.close();






    }
    
}
