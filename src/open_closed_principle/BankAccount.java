package open_closed_principle;



/*
Open closed principle (OCP)

*OCP states that, software entities (such as classes, modules, functions, etc.)
should be open for extension but closed for modification.

*In other words, you should be able to add new functionality
or behavior to a system without altering the existing code.

*Adding a new feature to software entities by modifying it,
 can lead new bugs, poor readability and hard to maintain.

 */



public interface BankAccount {
    public void deposit();
    public void withdraw(double amount);
    public double calculateInterest();
}



/*
Open closed principle (OCP)  Violation Example

There is a problem with the calculateInterest method.
What if there is a new account type introduced with new interest requirement,
We have to add another if condition in the calculateInterest method. It violates OCP.


 public class BankAccount {
  private double balance;
  private String accountNo;
  private String accountType;
  private SQLBankAccountRepository sqlBankAccountRepository;
  private NotificationService notificationService;

  //constructor
  public BankAccount(double balance, String accountNo, String accountType, SQLBankAccountRepository sqlBankAccountRepository, NotificationService notificationService) {
     this.balance = balance;
     this.accountNo = accountNo;
     this.accountType = accountType;
     this.sqlBankAccountRepository = sqlBankAccountRepository;
     this.notificationService = notificationService;
  }

  public void deposit() {
    //code to deposit amount
  }

  public void withdraw() {
   //code to withdraw amount
  }

  public double calculateInterest() {
    if(this.accountType.equals(‘Savings’))
     return this.balance * 0.03;

    else if(this.accountType.equals(‘Checking’))
     return this.balance * 0.01;

    else if(this.accountType.equals(‘FixedDeposit’))
     return this.balance * 0.05;
  }

}

 */
