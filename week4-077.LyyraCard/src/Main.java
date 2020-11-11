import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        LyyraCard Pekka = new LyyraCard(20);
        LyyraCard Brian = new LyyraCard(30);
        
        Pekka.payGourmet();
        Brian.payEconomical();
        
        System.out.println("Pekka: " + Pekka);
        System.out.println("Brian: " + Brian);
        
        Pekka.loadMoney(20);
        Brian.payGourmet();
        
        System.out.println("Pekka: " + Pekka);
        System.out.println("Brian: " + Brian);
        
        Pekka.payEconomical();
        Pekka.payEconomical();
        Brian.loadMoney(50);
        
        System.out.println("Pekka: " + Pekka);
        System.out.println("Brian: " + Brian);
        
//        LyrraCard card1 = new LyrraCard(10);
//        System.out.println(card1);
//        card1.payEconomical();
//        System.out.println(card1);
//        card1.payGourmet();
//        System.out.println(card1);
//        card1.payGourmet();
//        System.out.println(card1);
/*you can also write card1.toString() 
 *but java runtime just adds it to end 
 *so not needed */
        
//        card1.loadMoney(15);
//        System.out.println(card1);
//        card1.loadMoney(10);
//        System.out.println(card1);
//        card1.loadMoney(200);
//        System.out.println(card1);
//        card1.loadMoney(-15);
//        System.out.println(card1);




 
    }
}