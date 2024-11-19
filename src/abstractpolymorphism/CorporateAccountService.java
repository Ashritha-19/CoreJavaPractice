package abstractpolymorphism;

public interface CorporateAccountService extends AccountService{

    Account createAccount(String pan, String gst);

}
