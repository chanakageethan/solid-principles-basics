package single_responsibility_principle;


/*
Single responsibility principle (SRP)

*SRP states that, a class should have only one reason to change,
meaning it should have a single responsibility.

*This principle encourages you to create classes that do one thing and do it well.

*Lots of responsibilities make the class highly coupled,
harder to maintain and harder to understand.

 */


// BankAccount class will handle account related responsibilities
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

    public void withdraw(double amount) {
        //code to withdraw amount
    }

    public double calculateInterest() {
        //code to calculate interest
        return 0 ;
    }
}












//===========================================================
//Single responsibility violation Example

/*
saveBankAccountDetails and sendSmsNotification methods
are not related to bank account management’s behavior.




public class BankAccount {
    private double balance;
    private String accountNo;
    private String accountType;

    //constructor
    public BankAccount(double balance, String accountNo, String accountType) {
        this.balance = balance;
        this.accountNo = accountNo;
        this.accountType = accountType;
    }

    public void deposit() {
        //code to deposit amount
    }

    public void withdraw(double amount) {
        //code to withdraw amount
    }

    public double calculateInterest() {
        //code to calculate interest
    }

    public void saveBankAccountDetails() {
        //save account information to database
    }

    public void sendSmsNotification() {
        //code to send SMS notification to customer
    }
}
 */