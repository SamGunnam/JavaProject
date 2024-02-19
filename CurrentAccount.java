
/**
 *
 * @author Sampath Gunnam
 */
public class CurrentAccount extends Account {
    int overdraft =1000;
    
    public CurrentAccount(int aNum) {
        super(aNum);
    }       
    public double draft(double bal){                
        if(bal<=0 )
         overdraft - = 500;           
      return overdraft;  
    }    
}
