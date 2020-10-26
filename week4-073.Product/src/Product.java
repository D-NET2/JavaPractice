
import java.util.Scanner;

public class Product {

    private String name;
    private double price;
    private int amount;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.price = priceAtStart;
        this.amount = amountAtStart;
        this.name = nameAtStart;
    }

    public void printProduct() {
        System.out.println(this.name + "," +" price " + this.price +", " +"amount "+  this.amount);
    }
}
