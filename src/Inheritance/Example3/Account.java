package Inheritance.Example3;

public class Account {

   public String accountNumber;
   public double balance;


    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println( amount + ": /- Deposited"  +   balance +" : /- New Balance");
    }

   public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount +": /- Withdraw"  +   balance + ": /- New Balance");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    public void displayBalance() {
        System.out.println(balance +": /- Balance");
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}

