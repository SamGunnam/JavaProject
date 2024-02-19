# JavaProject
 A class for bank accounts.
   
   This class provides the basic functionality of accounts.
   It allows deposits and withdrawals but not overdraft
   limits or interest rates. 


Prompt!!

Look at the Account class Account.java and write a main method in a different class to briefly experiment with some instances of the Account class.

Using the Account class as a base class, write two derived classes called SavingsAccount and CurrentAccount. 
A SavingsAccount object, in addition to the attributes of an Account object, should have an interest variable and a method which adds interest to the account. 

A CurrentAccount object, in addition to the attributes of an Account object, should have an overdraft limit variable. Ensure that you have overridden methods of the Account class as necessary in both derived classes.
Now create a Bank class, an object of which contains of Account objects. These could be instances of the Account class, the SavingsAccount class, or the CurrentAccount class. Create some test accounts (some of each type).

Write an update method in the bank class. It iterates through each account, updating it in the following ways: Savings accounts get interest added (via the method you already wrote); CurrentAccounts get a letter sent if they are in overdraft.
The Bank class requires methods for opening and closing accounts, and for paying a dividend into each account.

Hints:

Note that the balance of an account may only be modified through the deposit(double) and withdraw(double) methods.
The Account class should not need to be modified at all.
Be sure to test what you have done after each step.
