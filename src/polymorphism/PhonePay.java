package polymorphism;

import java.util.*;

public class PhonePay implements UPIPayments {

    public static final double dailyLimit = 25000;

    public static Map<String,Double> accountBalanceMap = new HashMap<>();
    public static Map<String,Double> dailyTransactionMap = new HashMap<>();
    public static Map<String, List<Payment>> transactionHistory = new HashMap<>();

    static {
        accountBalanceMap.put("7672095126",100000.0);
        accountBalanceMap.put("9000308335",50000.0);
        dailyTransactionMap.put("7672095126", 0.0);
        dailyTransactionMap.put("9000308335", 0.0);
    }

    @Override
    public Payment transfer(String fromMobile, String toMobile, Double amount) {

        Payment p = new Payment();

    double dailyTotal =dailyTransactionMap.getOrDefault(fromMobile, 0.0) ;
        if (dailyTotal + amount > dailyLimit) {
        p.setStatus(Status.FAILURE.getMessage());
        p.setTranscationid(UUID.randomUUID().toString());
        p.setUtr(UUID.randomUUID().toString());
        p.setTransactionDate(new Date());
        p.setStatus("Transaction failed due to exceeding daily limit");
        saveTransaction(fromMobile, p);
        return p;
    }

        Double accountBalance = accountBalanceMap.get(fromMobile);
        if (accountBalance == null || accountBalance < amount) {
            p.setStatus(Status.FAILURE.getMessage());
            p.setTranscationid(UUID.randomUUID().toString());
            p.setUtr(UUID.randomUUID().toString());
            p.setTransactionDate(new Date());
            p.setStatus("Transaction failed due to insufficient balance");
            saveTransaction(fromMobile, p);
            return p;
        }

        accountBalanceMap.put(fromMobile, accountBalance - amount);
        accountBalanceMap.put(toMobile, accountBalanceMap.get(toMobile) + amount);

        dailyTransactionMap.put(fromMobile, dailyTotal + amount);

        p.setStatus(Status.SUCCESS.getMessage());
        p.setTranscationid(UUID.randomUUID().toString());
        p.setUtr(UUID.randomUUID().toString());
        p.setTransactionDate(new Date());

        saveTransaction(fromMobile, p);

        return p;
    }

    private void saveTransaction(String mobile, Payment payment) {
        transactionHistory.computeIfAbsent(mobile, k -> new ArrayList<>()).add(payment);
    }

    public static List<Payment> getTransactionHistory(String mobile) {
        return transactionHistory.getOrDefault(mobile, new ArrayList<>());
    }
}
