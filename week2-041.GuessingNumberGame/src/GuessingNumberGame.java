
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int num = 0;
        int count =1;
        while (num != numberDrawn) {
            System.out.println("Guess a number:");
            num = Integer.parseInt(reader.nextLine());
            if (num == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
               
            } else if (num < numberDrawn) {
                System.out.println("The number is greater, guesses made: "+count);
                count++;
            } else {
                System.out.println("The number is lesser, guesses made: "+count);
                count++;
            }

        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);//generates a random number between 0 to 100
    }
}
