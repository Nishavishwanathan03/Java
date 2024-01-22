public class object {
    public static void main(String[] args){
    object o = new object();

   book mybook = o.new book();
   mybook.read();



    }



    
    public class book{
        String name = "java";
        int version =  2000;
        String  publications = "Technical";
        String color = "REDD";

        void read(){
            System.out.println("you can read the book");
        }

        void borrow(){
            System.out.println("you can borrow the book");
        }
    }


}
