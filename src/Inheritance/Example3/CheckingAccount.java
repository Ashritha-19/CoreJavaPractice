package Inheritance.Example3;

public class CheckingAccount {

      public   int transactionLimit;

    public CheckingAccount(int transactionLimit) {
        this.transactionLimit = transactionLimit;
    }

    public void checkLimit() {
            System.out.println("Transaction limit: " + transactionLimit + " transactions per month.");
        }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "transactionLimit=" + transactionLimit +
                '}';
    }
}
