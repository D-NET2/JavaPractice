import java.util.Scanner;
import java.util.ArrayList;
public class RemoveLast{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        ArrayList<String> brothers = new ArrayList<String>();
        brothers.add("tom");
        brothers.add("david");
        brothers.add("moe");
       
        removeLast(brothers);
        print(brothers);
                
    }
    public static int NumberOfItems(ArrayList<String> list){
        int count=0;
        for( String words : list){
            count++;
        }
        return count-1;
        
    }
    
    public static void removeLast(ArrayList<String> list){
        
        list.remove(NumberOfItems(list));
    }
    
    public static void print(ArrayList<String> list){
        for(String word : list){
            System.out.println(word);
        }
    }
}