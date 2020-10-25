public class Greatest{
    public static void main(String args[]){
        int greatestnum = greatest(9, 10, 11);
        System.out.println("Greatest number: "+ greatestnum);
    }
    
    public static int greatest(int number1, int number2, int number3){
        if(number1>number2 && number1>number3){
            return number1;
        }
        if(number2>number1 && number2>number3){
            return number2;
        }
        if(number3>number1 && number3>number2){
            return number3;
        }
        if(number3==number2 && number3!=number1){
            return number3;
        }
        if(number2==number1 && number2!=number3){
            return number2;
        }
        if(number3==number1 && number3!=number2){
            return number3;
        }
        else{
            return number2; //all numbers are equal
        }
    }
}