public class ArrayList {
    public static void main(String[] args){


        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("curd");

        for(int i = 0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
        
    }

    
}
