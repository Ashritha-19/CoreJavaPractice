package interfaceandabstract;

public interface EditAccountSummary extends ExportAccountSummaryService{

  void edit(AccountSummary accountSummary);

    @Override
    void export(AccountSummary accountSummary);

}
