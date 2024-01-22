
public class constructor {
    
    public static void main(String[] args){
constructor c = new constructor();
        Human human1 = c. new Human("Nisha",20,52);
        Human human2 = c. new Human("sri",30,52);

        System.out.println(human1.name);
        human1.eat();
        human1.drink();
        human2.eat();
        human2.drink();
    }
    public class Human{

        String name;
        int age;
        double weight;

        Human(String name,int age,double weight){
            this.name = name;
            this.age = age;
            this.weight = weight;


        }

        void eat(){
            System.out.println(this.name +"is drinking");

        }
        void drink(){
            System.out.println(this.age + "is above oldage");
        }
    }


}
