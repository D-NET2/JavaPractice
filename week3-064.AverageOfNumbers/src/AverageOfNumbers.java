import java.util.Scanner;
import java.util.ArrayList;
public class AverageOfNumbers{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numlist = new ArrayList<Integer>();
        numlist.add(3);
        numlist.add(9);
        numlist.add(18);
        
        
        System.out.println("The average is: " +average(numlist));
    }
    public static int size(ArrayList<Integer> list){
        int count = 0;
        for(int i : list){
            count++;
        }
        return count;
    }
    public static int sum(ArrayList<Integer> list){
        int sum=0;
        for( int i : list){
            sum +=i;
        }
        return sum;
    }
    
    public static double average(ArrayList<Integer> list){
        double avg = ((double)(sum(list))/(size(list)));
        return avg;
    }
}