package level3;

public class XmlStrategy implements ReportStrategy {
    @Override
    public String generateReport() {
        return "Report generated in XML format";
    }
}
