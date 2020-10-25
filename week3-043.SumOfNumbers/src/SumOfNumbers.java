public class SumOfNumbers{
    public static void main(String args[]){
        int answer =sum(1, 5, 5, 10);
        System.out.println("sum is: "+ answer);
    }
    
    
    public static int sum(int number1, int number2, int number3, int number4){
        int sum = number1+number2+number3+number4;
        return sum;
    }
}