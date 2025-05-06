package interface_segregation_principle;

public class SavingsBankAccount implements BankAccount,  Withdrawable {
    @Override
    public void deposit() {

    }

    @Override
    public double calculateInterest() {
        return 0;
    }

    @Override
    public void withdraw() {

    }
    //deposit, calculateInterest, withdraw methods definitions
}
