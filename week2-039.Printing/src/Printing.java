import java.util.Scanner;
public class Printing{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        /*printStars(5);
        //printStars(3);
        printStars(9);
        printSquare(4);
        printRectangle(17,3);
        printTriangle(4);
        printStars(3);*/
        
        
        printTriangle(4);
    }
    
    public static void printStars(int amount){
        int count = 0;
        while(count < amount){
            System.out.print("*");
            count++;
        }
        System.out.print("");
        System.out.println("");
        
    }
    
    public static void printSquare(int sideSize){
        int count =0;
        while(count < sideSize){
            printStars(sideSize);
            count++;
        }
        System.out.print("");
        System.out.println("");
        
    }
    
    public static void printRectangle(int width, int height){
        int count =0;
        while(count < height){
            printStars(width);
            count++;
        }
        System.out.print("");
        System.out.println("");
        
    }
    
    
    public static void printTriangle(int size) {
        int count =1;
        while(count <= size){
            printStars(count);
            count++;
        }
        System.out.print("");
        System.out.println("");
        

    }
}