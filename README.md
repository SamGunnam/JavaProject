# JavaProject
 A class for bank accounts.
   
   This class provides the basic functionality of accounts.
   It allows deposits and withdrawals but not overdraft
   limits or interest rates. 


Using the Account class as a base class, write two derived classes called SavingsAccount and CurrentAccount. 
A SavingsAccount object, in addition to the attributes of an Account object, should have an interest variable and a method which adds interest to the account. 

A CurrentAccount object, in addition to the attributes of an Account object, should have an overdraft limit variable. Ensure that you have overridden methods of the Account class as necessary in both derived classes.
Now create a Bank class, an object of which contains of Account objects. These could be instances of the Account class, the SavingsAccount class, or the CurrentAccount class. Create some test accounts (some of each type).

Write an update method in the bank class. It iterates through each account, updating it in the following ways: Savings accounts get interest added (via the method you already wrote); CurrentAccounts get a letter sent if they are in overdraft.
The Bank class requires methods for opening and closing accounts, and for paying a dividend into each account.

