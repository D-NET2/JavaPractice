import java.util.Scanner;
public class Password{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        String password = "carrot";
       
        while (true) {

            System.out.println("Type the password: ");
            String password1 = reader.nextLine();

            if (password1.equals(password)) {
                System.out.println("Right!");
                System.out.println("The secret is: jabble23!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}