package Inheritance.Example3;

public class SavingsAccount extends Account {
    public double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println(interest +": /- Interest added"  +   balance+ ": /- New Balance" );
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
