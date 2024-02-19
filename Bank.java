package bank;

/**
 *
 * @author Sampath Gunnam
 */
public class Bank {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("*** Savings Account Details ***");
        SavingsAccount savaccount = new SavingsAccount(937752);
        savaccount.deposit(4500);
        savaccount.withdraw(1500);
        double accNum=savaccount.getAccountNumber();
        System.out.println("Your Savings Account Number is "+ accNum);
        double balance=savaccount.getBalance();
        System.out.println("Your Savings Account balance is : $"+balance);
        
        double finalBal=savaccount.interestCalc(balance);
        System.out.println("Your Balance with interest is $"+ finalBal);
        
        System.out.println("*** Current Account details ***");
        CurrentAccount curraccount=new CurrentAccount(945258);
        curraccount.deposit(1000);
        curraccount.withdraw(500);
        double accountNum=curraccount.getAccountNumber();
        System.out.println("Your Current Account Number is "+ accountNum);
        double bal=curraccount.getBalance();
        System.out.println("Your Current account balance is $"+ bal);        
        double overdraft=curraccount.draft(bal);
        System.out.println("Your overdraft Credit is $"+overdraft);
        curraccount.withdraw(750);        
        bal=curraccount.getBalance();
        System.out.println("Your Current account balance is $"+ bal);        
        overdraft=curraccount.draft(bal);
        System.out.println("Your overdraft Credit is $"+overdraft);
    }   
}
