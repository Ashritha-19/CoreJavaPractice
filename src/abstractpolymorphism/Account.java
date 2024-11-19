package abstractpolymorphism;


public class Account {

    private String accountNumber;

    private Double amount;

    private String pan;

    private String gst;


/*    public Account(String accountNumber, Double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }*/

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }






}
