
import java.util.Scanner;

public class Accounts {

    public static void main(String args[]) {
        Account Mattsaccount = new Account("Matt's account", 1000.00);
        Account Myaccount = new Account("My account", 0.00);
        Mattsaccount.withdrawal(100);
        Myaccount.deposit(100);
        System.out.println(Mattsaccount);
        System.out.println(Myaccount);

    }
}
