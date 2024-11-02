package polymorphism;

import java.util.List;

public class InterfaceTest {

    public static void main(String[] args) {
        UPIPayments payments = new PhonePay();

        Payment pay1 = payments.transfer("7672095126", "9000308335", 3000.0);
        Payment pay2 = payments.transfer("7672095126", "9000308335", 23000.0);
        Payment pay3 = payments.transfer("7672095126", "9000308335", 5000.0);

        System.out.println(pay1.getTranscationid() + " status " + pay1.getStatus() + " UTR " + pay1.getUtr() + " Date " + pay1.getTransactionDate());
        System.out.println(pay2.getTranscationid() + " status " + pay2.getStatus() + " UTR " + pay2.getUtr() + " Date " + pay2.getTransactionDate());
        System.out.println(pay3.getTranscationid() + " status " + pay3.getStatus() + " UTR " + pay3.getUtr() + " Date " + pay3.getTransactionDate());


        System.out.println("Balance of from account " + PhonePay.accountBalanceMap.get("7672095126"));
        System.out.println("Balance of to account " + PhonePay.accountBalanceMap.get("9000308335"));


        List<Payment> history = PhonePay.getTransactionHistory("7672095126");
        System.out.println("Transaction history for 7672095126:");
        for (Payment transaction : history) {
            System.out.println(transaction.getTranscationid() + " status " + transaction.getStatus() + " UTR " + transaction.getUtr() + " Date " + transaction.getTransactionDate());
        }
    }
}
