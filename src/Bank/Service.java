package Bank;

public class Service {

    public Passbook createAccount(UserData userData){
        Passbook passbook= new Passbook();
        passbook.accountHolderName = "SriKrishna";
        passbook.accountNumber = "99998247649270";
        passbook.ifscNumber = "123456";
        passbook.branchName = "Kotapet";

        return passbook;
    }
}
