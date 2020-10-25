import java.util.Scanner;
public class Usernames{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
    
        
        System.out.println("Type your username: ");
        String typeUsername = reader.nextLine();
        System.out.println("Type your password: ");
        String typepassword = reader.nextLine();
        
        if( (typeUsername.equals("alex")) &&(typepassword.equals("mightyducks")) ){
            System.out.println("You are now logged into the system!");
        }
        else if( (typeUsername.equals("emily")) &&(typepassword.equals("cat")) ){
            System.out.println("You are now logged into the system!");
        }
        else{
            System.out.println("Your username or password was invalid!");
        }
        
    }
}