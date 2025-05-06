package interface_segregation_principle;

public class LoanBankAccount implements BankAccount {
    @Override
    public void deposit() {

    }

    @Override
    public double calculateInterest() {
        return 0;
    }
    // deposit, calculateInterest methods definitions
}