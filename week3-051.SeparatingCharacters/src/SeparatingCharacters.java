import java.util.Scanner;
public class SeparatingCharacters{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        int count = (name.length()-1);
        int j=1;
        for(int i=0;i<=count;i++){
            char letter = name.charAt(i);
            System.out.println(j+". character: "+letter);
            j++;
        }
    }
}