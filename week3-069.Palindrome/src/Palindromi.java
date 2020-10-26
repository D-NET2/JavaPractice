import java.util.Scanner;
import java.util.ArrayList;
public class Palindromi{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a text: ");
        String text = reader.nextLine();
        
        if(palindrome(text)){
            System.out.println("The text is a palindrome!");
        }
        else{
            System.out.println("The text is not a palindrom!");
        }
                
    }
    
    public static boolean palindrome(String text){
        int textlength = (text.length()-1);
        int count = (text.length() -1);
        String backwardText = "";
        for(int i=0;i<=count;i++){
            backwardText += text.charAt(textlength);
            textlength--;
        }
        //System.out.println(backwardText);
        if(text.equals(backwardText)){
            return true;
        }
        else{
            return false;
        }
        
        
        
        
    }
}