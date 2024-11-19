package abstractpolymorphism;

public interface RetailAccountService extends AccountService{

       Account createAccount(String gst, String pan);


}
