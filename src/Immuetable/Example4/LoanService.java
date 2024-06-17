package Immuetable.Example4;

import Immuetable.Example4.DataForBank;

public class LoanService {

    public boolean loanSanction(DataForBank data) {
        double applicantSalary = data.getApplicantSalary();
        double totalLoanAmt = data.getApplicant().getTotalLoanAmt();
        double interestAmt = data.getApplicant().getInterestAmt();

        if (applicantSalary < 20000) {
            System.out.println("Loan Denied: Applicant's salary is too low.");
            return false;
        }

        if (totalLoanAmt > applicantSalary * 5) {
            System.out.println("Loan Denied: Loan amount exceeds allowable limit based on salary.");
            return false;
        }

        if (interestAmt > totalLoanAmt * 0.2) {
            System.out.println("Loan Denied: Interest amount is too high.");
            return false;
        }

        System.out.println("Loan Approved.");
        return true;
    }
}
