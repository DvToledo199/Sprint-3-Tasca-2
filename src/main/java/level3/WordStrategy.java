package level3;

public class WordStrategy implements ReportStrategy{
    @Override
    public String generateReport() {
        return "Report generated in Word format";
    }
}
