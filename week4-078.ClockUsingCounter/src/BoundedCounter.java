/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author D
 */
public class BoundedCounter {
    private int value;
    private int upperBound;
    
    public BoundedCounter(int upperlimit){
        this.value = 0;
        this.upperBound = upperlimit;
    }
    
    public void next(){
        this.value++;
        if (this.value > this.upperBound){
            this.value = 0;
        }
    }
    
    public String toString(){
    	if (this.value < 10) {
    		return "0" + this.value;
    	}
        return "" + this.value;
    }
    
    public int getValue() {
    	return this.value;
    }
    
    public void setValue(int newValue) {
    	if(newValue < 0 || newValue > this.upperBound) {
    		this.value = 0;
    	}
    	else {
    		this.value = newValue;
    	}
        
    }
}
