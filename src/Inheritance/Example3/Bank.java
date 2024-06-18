package Inheritance.Example3;

public class Bank {

    public static void main(String[] args) {
         Account account = new Account("99997672095126",12000);
         account.deposit(25000);
         account.withdraw(10000);

         SavingsAccount savingsAccount = new SavingsAccount("12345678",12000,4);
         savingsAccount.displayBalance();
         savingsAccount.addInterest();

         CheckingAccount check = new CheckingAccount(100000);
         check.checkLimit();

         LoanAccount loanAccount = new LoanAccount("123456789",10000,25000,3);
         loanAccount.calculateEMI();



    }
}
