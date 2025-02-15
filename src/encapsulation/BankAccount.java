package encapsulation;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    //Getter Method
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Constructor to initialize the account
    public BankAccount(String accountNumber, String accountHolderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;

    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance " + balance);
        } else {
            System.out.println("Deposited amount must be Positive");

        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdraw " + amount + ". New balance " + balance);
            } else {
                System.out.println("Insufficient Funds \n");

            }
        }else{
                System.out.println("Deposited amount must be Positive");

            }
    }

        public static void main (String[] args){
            System.out.println("\n \tEncapsulation using Bank Account");
            BankAccount account1 = new BankAccount("12345", "Nivethitha", 500);
            System.out.println("\nAccount Number: " + account1.getAccountNumber() + ", Account Holder: " + account1.getAccountHolderName());
            account1.deposit(200);
            account1.withdraw(1000);

            BankAccount account2 = new BankAccount("67890", "Nataraja", 1000);
            System.out.println("\nAccount Number: " + account2.getAccountNumber() + ", Account Holder: " + account2.getAccountHolderName());
            account2.deposit(2000);
            account2.withdraw(500);
            account2.withdraw(100);

            BankAccount account3 = new BankAccount("13764", "Sai", 700);
            System.out.println("\nAccount Number: " + account3.getAccountNumber() + ", Account Holder: " + account3.getAccountHolderName());
            account3.deposit(100);
            account3.withdraw(500);
            account3.withdraw(100);

        }
    }
