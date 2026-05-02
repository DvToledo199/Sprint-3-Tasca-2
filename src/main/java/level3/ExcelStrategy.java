package level3;

public class ExcelStrategy implements ReportStrategy{
    @Override
    public String generateReport() {
        return "Report generated in Excel format";
    }
}
