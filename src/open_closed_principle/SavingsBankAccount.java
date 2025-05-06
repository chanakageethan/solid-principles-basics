package open_closed_principle;

public class SavingsBankAccount implements BankAccount {
    // attributes and constructor
    // deposit and withdraw method declarations
    private double balance;
    private String accountNo;


    public SavingsBankAccount(
            double balance, String accountNo
    ) {
        this.balance = balance;
        this.accountNo = accountNo;
    }

    @Override
    public void deposit() {

    }

    @Override
    public void withdraw(double amount) {
    }

    @Override
    public double calculateInterest() {
        return this.balance * 0.03;
    }

}