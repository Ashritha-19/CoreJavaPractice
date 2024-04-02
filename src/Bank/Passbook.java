package Bank;

public class Passbook {
    public String accountHolderName;
    public String accountNumber;
    public String ifscNumber;
    public String branchName;


    @Override
    public String toString() {
        return "Passbook{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", ifscNumber='" + ifscNumber + '\'' +
                ", branchName='" + branchName + '\'' +

                '}';
    }
}
