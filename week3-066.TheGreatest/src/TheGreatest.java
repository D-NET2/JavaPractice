import java.util.Scanner;
import java.util.ArrayList;
public class TheGreatest{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> listOfnumber = new ArrayList<Integer>();
        listOfnumber.add(1);
        listOfnumber.add(20);
        listOfnumber.add(45);
        listOfnumber.add(34);
        listOfnumber.add(35);
        listOfnumber.add(21);
        listOfnumber.add(10);
        
        int greatestNum = greatest(listOfnumber);
        System.out.println("The greatest number is: " + greatest(listOfnumber));
    }
    
    public static int greatest(ArrayList<Integer> list){
        int maxNum = list.get(0);
        for(int item : list){
            if (item>maxNum){
                maxNum = item;
            }
            else{
                //skip move to next number in the ArrayList
            }
            
        }
        return maxNum;
    }
}