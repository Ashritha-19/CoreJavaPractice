package interfaceandabstract;

public class Excel implements EditAccountSummary {

    @Override
    public void edit(AccountSummary accountSummary) {

    }

    @Override
    public void export(AccountSummary accountSummary) {

        System.out.println("Account Summary is exporting into Excel");

    }

}
