package level3;

public class CsvStrategy implements ReportStrategy {
    @Override
    public String generateReport() {
        return "Report generated in CSV format";
    }
}
