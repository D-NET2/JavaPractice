import java.util.Scanner;
import java.util.ArrayList;
public class SumOfNumbers{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numlist = new ArrayList<Integer>();
        numlist.add(1);
        numlist.add(10);
        numlist.add(17);
        numlist.add(112);
        
        System.out.println("The sum: " + sum(numlist) );
    }
    
    public static int sum(ArrayList<Integer> list){
        int sum=0;
        for( int i : list){
            sum= sum+i;
        }
        return sum;
    }
}