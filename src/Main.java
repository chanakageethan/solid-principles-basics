
//Single responsibility principle (SRP)


import open_closed_principle.BankAccount;
import open_closed_principle.CheckingBankAccount;
import open_closed_principle.FixedDepositBankAccount;
import open_closed_principle.SavingsBankAccount;

public class Main {
    public static void main(String[] args) {

        //------------------------------------------------------------------------------------------------------
        //Open closed principle (OCP)
        BankAccount savingsBankAccount = new SavingsBankAccount(20000,"104454545454");
        double savingsBankAccountInterest = savingsBankAccount. calculateInterest();

        BankAccount checkingBankAccount = new CheckingBankAccount(10012,"204454545454");
        double checkingBankAccountInterest = checkingBankAccount. calculateInterest();

        BankAccount fixedDepositBankAccount = new FixedDepositBankAccount(30000,"664454545454");
        double fixedDepositBankAccountInterest = fixedDepositBankAccount. calculateInterest();
        //------------------------------------------------------------------------------------------------------


        //------------------------------------------------------------------------------------------------------

    }
}