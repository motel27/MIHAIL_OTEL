package homework_nr_6;

public class BankAccount {

    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("deposit amount should be more than 0");
        } else {
            balance += amount;
            System.out.println("On the Account has been deposit " + amount + " amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("withdraw amount should be more than 0");
        } else {
            balance -= amount;
            System.out.println("From the Balance of Account has been withdraw " + amount + " amount");
        }


    }

    public double getBalance() {
        return balance;
    }


    public static void main(String[] args) {

        BankAccount BankAccount = new BankAccount("2000401456", 10000);
        System.out.println("Account number: "+ BankAccount.accountNumber);
        System.out.println("Current balance: "+ BankAccount.balance);

        BankAccount.deposit(200.0);
        System.out.println("Balance after deposit: " + BankAccount.getBalance());

        BankAccount.deposit(5000);
        System.out.println("Balance after deposit: " + BankAccount.getBalance());

        BankAccount.withdraw(10000);
        System.out.println("Balance after withdraw: " +BankAccount.getBalance());

        System.out.println("-----------------------------------------------------------");
        System.out.println("Current balance after all operations: "+ BankAccount.balance);
        }
    }

