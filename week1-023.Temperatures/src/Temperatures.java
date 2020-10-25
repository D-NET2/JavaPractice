
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while (true) {
            System.out.println("Type a number: ");
            Double num1 = Double.parseDouble(reader.nextLine());
            // Graph is used as follows:
            if((num1<-30)||(num1>40)){
                 
            }else{
                Graph.addNumber(num1);
            }
        }
    }
}
