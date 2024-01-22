public class Car2 {
private static String name;
private static String model;
private static int  year;


Car2(String name,String model,int  year){
this.name = name;
this.model = model;
Car2.year = year;
        }

        Car2(Car3 x){
            this.Copy(x);
        }
        public static String getName(){
        return name;
        }
       public static String getModel(){
        return model;
       } 
       public static int getYear(){
        return year;
       }
       public void setName(String Name){
        this.name = name;
       }
       public void setModel(String model){
        this.model = model;
       }
       public void setYear(int year){
        this.year = year;
       }
       public void copy( carx){
        
        this.setName(x.getname());
        this.setModel(x.getmodel());
        this.setYear(x.getyear());
   
    }


    public void Copy(Car3 car3) {
    }}
    
    

