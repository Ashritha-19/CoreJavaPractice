package polymorphism;

import java.util.Date;

public class Payment {

    private String transcationid;

    private String utr;

    private String status;

    private Date transactionDate;

    public String getTranscationid() {

        return "";
    }


    public void setTranscationid(String transcationid) {
        this.transcationid = transcationid;
    }

    public String getUtr() {
        return utr;
    }

    public void setUtr(String utr) {
        this.utr = utr;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
}
