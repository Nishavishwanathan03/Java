public class PrimeNumber {
    public static void main(String[ ] args){

        int i ,m = 0,flag = 0;
        int n = 3;
        m = n/2;
        if(n==0|| n==1){
            System.out.println(" it is not a prime");

        }
        else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                System.out.println("itis not a prime");
                flag = 1;
                break;
                }

            }
            if(flag ==0){
                System.out.println("itis  a prime");

            }

        }
    }
    
}
