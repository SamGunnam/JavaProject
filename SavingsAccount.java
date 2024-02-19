package bank;

/**
 *
 * @author Sampath Gunnam
 */
public class SavingsAccount extends Account{
    
    double interest = 2.5;
    
    public SavingsAccount(int accnum) {
        super(accnum);
    }  
    
    public double interestCalc(double bal) {
        
        bal += bal * interest/100;
        return bal;
    }
    
}
