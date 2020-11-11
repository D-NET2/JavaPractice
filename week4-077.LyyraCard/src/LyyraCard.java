/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author D
 */
public class LyyraCard {
    private double balance;
    
    
    public LyyraCard(double balanceAtStart){
        this.balance = balanceAtStart;
    }
    
    @Override
    public String toString(){
        return "The card has " + this.balance + " euros";
    }
    
    public void payEconomical(){
        if(this.balance>=2.50){
            this.balance -= 2.50;//charge
        }
        //dont charge 
    }
    
    public void payGourmet(){
        if(this.balance>=4.00){
            this.balance -= 4.00;//charge
        }
        //dont charge
    }
    
    public void loadMoney(double amount){
        double maxBalance =150.00;
        
        if(this.balance < maxBalance){
            if ((amount > 0) && (amount < (maxBalance-this.balance))){
                this.balance += amount;
            }
            if ((amount > 0) && (amount > (maxBalance-this.balance))){
                this.balance = 150.00;
            }
            //ignore
            
        }
        //else ignore and dont change balncae
    }
    
    
}
