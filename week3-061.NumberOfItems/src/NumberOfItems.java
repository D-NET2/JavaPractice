import java.util.ArrayList;
import java.util.Scanner;
public class NumberOfItems{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        
        ArrayList<String> biglists = new ArrayList<String>();
        biglists.add("Marcus");
        biglists.add("arcus");
        biglists.add("paul");
        System.out.println("There are this many items in the list:");
        System.out.println(countItems(biglists));
    }
    
    public static int countItems(ArrayList<String> list){
        int count =0;
        for(String items : list){
            count++;
        }
        return count;
    }
}