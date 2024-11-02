package kk;

import java.util.Date;
import java.util.UUID;

public class AccountService {

    public Account createAccount(UserDetails user){
  /*    userDetails.name = "Krish";
        userDetails.aadhar = "123456u";
        userDetails.pan = "asd234";
        userDetails.age = 23;
        userDetails.mobile = "1234567890";  */

        Account account = new Account();
        account.accountNumber = UUID.randomUUID().toString();
        account.bankName = "HDFC";
        account.userDetails = user;

        return account;

    }

    public AtmCard createAtmCard(Account account){

        AtmCard atmCard = new AtmCard();
        atmCard.cardNumber = account.accountNumber;
        atmCard.cvv = "999";
        atmCard.name = account.userDetails.name;
        atmCard.fromDate = new Date();
        atmCard.toDate = new Date();
        return atmCard;
    }
}
