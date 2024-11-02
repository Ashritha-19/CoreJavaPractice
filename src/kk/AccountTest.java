package kk;

import javax.print.attribute.standard.NumberUpSupported;

public class AccountTest {

    public static void main(String[] args) {

        AccountService accountService = new AccountService();

        UserDetails user = new UserDetails();
        user.name = "Krish";
        user.aadhar = "123456u";
        user.pan = "asd234";
        user.age = 23;
        user.mobile = "1234567890";

       Account userAccount = accountService.createAccount(user);

        System.out.println("Account:"+ userAccount);

        AtmCard atmCard = new AtmCard();

        atmCard = accountService.createAtmCard(userAccount);

        System.out.println("AtmCard:" + atmCard);



    }
}
