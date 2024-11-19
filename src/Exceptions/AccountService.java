package Exceptions;

public class AccountService {

    public void debit(Account account, double amount) throws Exception {
        if (account.getBalance() < amount) {
            throw new Exception("Insufficient balance!");
        }
        account.setBalance(account.getBalance() - amount);
        System.out.println("Amount debited: " + amount);
    }


    public void credit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Amount credited: " + amount);
    }
}

