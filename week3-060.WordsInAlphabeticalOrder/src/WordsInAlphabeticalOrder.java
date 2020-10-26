import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class WordsInAlphabeticalOrder{
    public static void main(String args[]){
        ArrayList<String> wordlist = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        String word = " ";
        while(!(word.equals(""))){
            System.out.println("Type a word: ");
            word = reader.nextLine();
            wordlist.add(word);
        }
        
        Collections.sort(wordlist);//sorts in alphabetical order
        for(String name : wordlist){
            System.out.println(name);
            
        }
        
        
   
        
    }
    
}