package Immuetable.Example4;

public  class ApplicantDetails {

    private  String loanId;
    private  int interestPercentage;
    private  double totalLoanAmt;
    private  double interestAmt;

    public ApplicantDetails(String loanId, int interestPercentage, double totalLoanAmt) {
        this.loanId = loanId;
        this.interestPercentage = interestPercentage;
        this.totalLoanAmt = totalLoanAmt;
        this.interestAmt = totalLoanAmt * interestPercentage / 100;
    }

    public String getLoanId(){
        return loanId;
    }

    public int getInterestPercentage() {

        return interestPercentage;
    }

    public double getInterestAmt() {

        return interestAmt;
    }

    public double getTotalLoanAmt() {

        return totalLoanAmt;
    }

    @Override
    public String toString() {
        return "ApplicantDetails{" +
                "loanId='" + loanId + '\'' +
                ", interestPercentage=" + interestPercentage +
                ", totalLoanAmt=" + totalLoanAmt +
                ", interestAmt=" + interestAmt +
                '}';
    }
}
