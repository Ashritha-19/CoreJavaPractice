package abstractpolymorphism;

import polymorphism.Payment;

public interface RBIPayment {

    Payment transfer(String fromAccount, String toAccount, double amount);
}
