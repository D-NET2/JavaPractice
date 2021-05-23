import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides){
        this.numberOfSides = numberOfSides;
        random = new Random();

    }

    public int roll() {
          // we'll get a random number in the range 1-numberOfSides<
    	int Max = this.numberOfSides;
    	int Min=1;
    	return Min + (int)(Math.random() * ((Max - Min) + 1));
}
}