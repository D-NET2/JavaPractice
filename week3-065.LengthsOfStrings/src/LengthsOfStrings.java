import java.util.Scanner;
import java.util.ArrayList;
public class LengthsOfStrings{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        ArrayList<String> listings = new ArrayList<String>();
        listings.add("book");
        listings.add("Tom");
        listings.add("Will");
        listings.add("Vin");
        listings.add("moe");
        listings.add("Calfornia");
        
        ArrayList<Integer> lengths = lengths(listings);
        System.out.println("The lengths of the Strings: "+ lengths);
    }
    
    public static ArrayList<Integer> lengths(ArrayList<String> list){
        ArrayList<Integer> lengthOfword = new ArrayList<Integer>();
        for(String count : list){
            int wordlength = count.length();
            lengthOfword.add(wordlength);
        }
        return lengthOfword;
    }
}