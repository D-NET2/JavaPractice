import java.util.Scanner;
public class Circumference{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius: ");
        int R = Integer.parseInt(reader.nextLine());
        double radius = (R * 2*(Math.PI));
        System.out.println("Circumference of the circle: " + radius);
    }
}