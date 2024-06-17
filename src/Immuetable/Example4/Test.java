package Immuetable.Example4;

import Immuetable.Example4.ApplicantDetails;
import Immuetable.Example4.DataForBank;
import Immuetable.Example4.LoanService;

public class Test {

    public static void main(String[] args) {
        ApplicantDetails applicantDetails = new ApplicantDetails("ABC123", 5, 10000);
        DataForBank dataForBank = new DataForBank(30000, applicantDetails);
        LoanService loanService = new LoanService();

        loanService.loanSanction(dataForBank);
    }
}
