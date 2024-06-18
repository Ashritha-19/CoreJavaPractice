package Inheritance.Example3;

public class LoanAccount extends Account {
   public double loanAmount;
   public double interestRate;

    public LoanAccount(String accountNumber, double balance, double loanAmount, double interestRate) {
        super(accountNumber, balance);
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    public void calculateEMI() {
        double monthlyInterest = interestRate / 12 / 100;
        double emi = (loanAmount * monthlyInterest) / (1 - Math.pow(1 + monthlyInterest, -12));
        System.out.println(emi+": /- Monthly EMI");
    }

    @Override
    public String toString() {
        return "LoanAccount{" +
                "loanAmount=" + loanAmount +
                ", interestRate=" + interestRate +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
