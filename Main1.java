public class Main1 {
    public static void main(String[] args){
         Car2 car2 = new Car2("BMW","newmodel",2000);
         Car3 car3 = new Car3("niiii", "guyh",2001);
         car2.Copy(car3);
        System.out.println(car2);
         System.out.println();


System.out.println(Car2.getName());
System.out.println(Car2.getModel());
System.out.println(Car2.getYear());
System.out.println();
System.out.println(Car3.getName());
System.out.println(Car3.getModel());
System.out.println(Car3.getYear());
System.out.println();
    }
}
