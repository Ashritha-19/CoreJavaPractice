package abstractpolymorphism;

import java.util.UUID;

public class RetailAccountServiceImpl implements RetailAccountService{


    @Override
    public Account createAccount(String gst, String pan) {
        Account account = new Account();
        account.setAccountNumber(UUID.randomUUID().toString());
        account.setAmount(1000.0);
        account.setPan(pan);
        account.setGst(gst);
        SbiAccountDbService.accountMap.put(account.getAccountNumber(), account);
        return account;
    }
}
