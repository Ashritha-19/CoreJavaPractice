package Immuetable;

public class AccDetails {

    private String mobileNumber;
    private String fromAcc;
    private String toAcc;
    private int amt;

     public AccDetails(String mobileNumber, int amt){
      this.mobileNumber = mobileNumber;
      this.amt = amt;

     }


    public AccDetails(String fromAcc, String toAcc, int amt) {
        this.fromAcc = fromAcc;
        this.toAcc = toAcc;
        this.amt = amt;
    }


    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getFromAcc() {
        return fromAcc;
    }

    public String getToAcc() {
        return toAcc;
    }

    public int getAmt() {
        return amt;
    }
}
