
public class NumberStatistics {
    private int amountOfNumbers;
    private int sumOfNumbers;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
    	this.amountOfNumbers = 0;
    	this.sumOfNumbers = 0;
    }

    public void addNumber(int number) {
        this.amountOfNumbers++;
        this.sumOfNumbers+=number;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }
    
    public int sum() {
    	return this.sumOfNumbers;
    }
    
    public double average() {
    	if(this.amountOfNumbers > 0) {
    		return this.sumOfNumbers/(double)this.amountOfNumbers;
    	}
    	return 0;
    }
}