import java.util.Random;
public class Least{
    public static void main(String args[]){
        int leastnumber = least(8, 8);
        System.out.println("The least number: "+ leastnumber);
    }
    
    public static int least(int number1, int number2){
        if(number1<number2){
            return number1;
        }
        if(number2<number1){
            return number2;
        }
        else{
            Random rand = new Random();
            int n = rand.nextInt(1);//picks random number between 0-1
            if(n==0){
                return number2;
            }
            else{
                return number1;
            }
        }
    }
}