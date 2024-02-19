package bank;

/**
 *
 * @author Sampath Gunnam
 */
public class Account {
    private double bal; 
    private int accnum; 
    
    public Account(int a)
    {    
	bal=0.0;
	accnum=a;
    }
    
    public void deposit(double sum)
    {
	if (sum>0) {
	    bal+=sum;  
            System.out.println("Deposited amount : $"+sum);
        }
	else
	    System.out.println("Account.deposit(...): "
			       +"cannot deposit negative amount.");    
    }
    
    public void withdraw(double sum)
    {
	if (sum>0){
	    bal-=sum;
            System.out.println("Withdrawn Amount : $" +sum);
        }
	else
	    System.out.println("Account.withdraw(...): "
			       +"cannot withdraw negative amount.");    
    }
    
    
    public double getBalance()
    {
	return bal;
    }
    
    public double getAccountNumber()
    {
	return accnum;
    }
    
    public String ToString()
    {
	return "Acc " + accnum + ": " + "balance = " + bal;    
    }
    
    public final void print()
    {
	//Don't override this,
	//override the toString method
	System.out.println( toString() );    
    }
    
}
