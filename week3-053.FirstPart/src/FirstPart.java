import java.util.Scanner;
public class FirstPart{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        System.out.println("Length of the first part: ");
        int num = Integer.parseInt(reader.nextLine());
        
        
        String firstpart = word.substring(0,num);
        System.out.print("Result: " + firstpart);
            
        } 
    }
