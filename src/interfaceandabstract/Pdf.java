package interfaceandabstract;

public class Pdf implements ExportAccountSummaryService {

    @Override
    public void export(AccountSummary accountSummary) {

        System.out.println("Account Summary is exporting into pdf");

    }

    void test(){

    }
}
