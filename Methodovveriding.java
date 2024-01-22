public class Methodovveriding {
    
    public static void main(String[] args){

Dog dog = new Dog();
Animal animal = new Animal();
dog.bark();
animal.speak();
        public class Animal{
            void speak(){
                System.out.println("This animal speaks");
    
        }
            
        }
    }
    public class Dog extends Animal{
        void bark(){
            System.out.println("This animal bark");

    }
    
    }
}
                                                                      