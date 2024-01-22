import javax.naming.NameAlreadyBoundException;

public class Main4 {
    public static void main(String[] args){
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();
        Vehicle[] racers = {bicycle , boat};
        for (Vehicle x : racers){
            x.go();
        }
    }
}
