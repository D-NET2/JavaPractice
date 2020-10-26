import java.util.Scanner;
public class ReversingName{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        int numletters = name.length()-1;
        int count =0;
        while (count <= numletters){
            char letter = name.charAt(numletters);
            System.out.print(letter);
            numletters--;
        }
    }
}