import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
    	NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
    	NumberStatistics odd = new NumberStatistics();
        int num = 0;
        System.out.println("Type numbers: ");
    	while(num != -1) {
    		num = Integer.parseInt(reader.nextLine());
    		if(num!=-1) {
    			stats.addNumber(num);
    		}
    		if(num%2==0 && num!=-1) {
    			even.addNumber(num);
    		}
    		if(num%2!=0 && num!=-1) {
    			odd.addNumber(num);
    		}
    	}
    	
//    	stats.addNumber(3);
//        stats.addNumber(5);
//        stats.addNumber(1);
//        stats.addNumber(2);
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
    }
}