package Immuetable;

public class PhnPay {


    private String accNumber;

    private String mobileNumber;


    public PhnPay(String accNumber, String mobileNumber) {
        this.accNumber = accNumber;
        this.mobileNumber = mobileNumber;
    }


    public String getAccNumber() {
        return accNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}
