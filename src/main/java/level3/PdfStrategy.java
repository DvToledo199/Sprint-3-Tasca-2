package level3;

public class PdfStrategy implements ReportStrategy{
    @Override
    public String generateReport() {
        return "Report generated in PDF format";
    }
}
