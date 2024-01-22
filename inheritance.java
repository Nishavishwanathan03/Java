import java.lang.Object;

public class inheritance {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
Car car =  vehicle.new Car();


    }
public class Vehicle{
double speed;
void go() {
    System.out.println("The vehile is moviing");
}
void stop() {
    System.out.println("The vehile is stop");

}

}

public class Car extends Vehicle{

}



}
