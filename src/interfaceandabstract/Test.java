package interfaceandabstract;

public class Test {

    public static void main(String[] args) {

        ExportAccountSummaryService pdfService = new Pdf();
        AccountSummary accountSummary = new AccountSummary();
        pdfService.export(accountSummary);

        ExportAccountSummaryService excelService = new Excel();
        excelService.export(accountSummary);

    }
}
