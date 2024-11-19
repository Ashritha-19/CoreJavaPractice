package abstractpolymorphism;

import java.util.UUID;

public class CorporateAccountServiceImpl implements CorporateAccountService {


    @Override
    public Account createAccount(String pan, String gst) {
        Account account = new Account();
        account.setAccountNumber(UUID.randomUUID().toString());
        account.setAmount(10000.0);
        account.setPan(pan);
        account.setGst(gst);
        SbiAccountDbService.accountMap.put(account.getAccountNumber(),account);
        return account;
    }
}
