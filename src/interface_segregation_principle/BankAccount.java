package interface_segregation_principle;



/*

Interface segregation principle (ISP)

*ISP states that, clients
should not be forced to depend on interfaces they do not use.


*This principle encourages you to create specific, fine-grained interfaces rather than large, monolithic ones,
to avoid forcing clients to implement methods they don’t need.

 */


public interface BankAccount{
    public void deposit();
    public double calculateInterest();
}






/*
Interface segregation principle (ISP)  Violation example


Here, withdraw method in SavingsBankAccount and CheckingBankAccount classes working fine. But LoanBankAccount have a empty withdraw method,
because in loan account withdrawing process not allowed.


The implementation classes should use only the methods that are required.


public interface BankAccount() {
  public void deposit();
  public void withdraw(double amount);
  public double calculateInterest();
}

public class SavingsBankAccount implements BankAccount {
  // attributes and constructor
  // deposit and calculateInterest method declarations

  public void withdraw(double amount) {
    if (this.balance < double amount)
        this.balance-=amount;
  }

}

public class CheckingBankAccount implements BankAccount {
  // attributes and constructor
  // deposit and withdraw method declarations

  public void withdraw(double amount) {
    if (this.balance < double amount)
        this.balance-=amount;
  }

}
public class LoanBankAccount implements BankAccount {
  // attributes and constructor
  // deposit and withdraw method declarations

  public double withdraw() {
    //empty method – cannot withdraw from loan accounts
  }

}

 */
